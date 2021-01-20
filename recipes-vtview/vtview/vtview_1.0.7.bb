DESCRIPTION = "Virtium vtView program."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=3da9cfbcb788c80a0384361b4de20420"

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"

PR = "r1"

SRC_URI = "file://COPYING ftp://10.10.33.13/public/arm/vtview-${PV}.tar.bz2"
SRC_URI[md5sum] = "9618eaf5e1d66f53c38f38a0e069a34b"
SRC_URI[sha256sum] = "5a2602936d0d2b62412b22c5ffa78e10ba013fae7231ce9ffa627013835ce86b"

inherit systemd    
SYSTEMD_SERVICE_${PN} = "vtView.service"

S = "${WORKDIR}"
export installdir = "${base_prefix}/opt/vtView"

do_install() {
  install -d ${D}${installdir}
  install -m 0755 vtView ${D}${installdir}

  install -d ${D}${systemd_unitdir}/system
  install -m 0644 vtView.service ${D}${systemd_unitdir}/system
}

FILES_${PN} = "${base_prefix}/opt/*"
FILES_${PN} += "${systemd_unitdir}/system/vtView.service"
