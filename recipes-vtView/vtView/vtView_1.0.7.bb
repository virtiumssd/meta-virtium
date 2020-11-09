DESCRIPTION = "Virtium vtView program."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=3da9cfbcb788c80a0384361b4de20420"

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"

PR = "r1"

SRC_URI = "file://COPYING ftp://10.10.33.13/public/${PN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "d7f3f7d2037a4a27355bc241800bd940"
SRC_URI[sha256sum] = "4873086f193b9f0e1ffafd5e0f26bba586847397ccc8dcd8374d3ef024e156af"

inherit systemd    
SYSTEMD_SERVICE_${PN} = "vtView.service"

S = "${WORKDIR}"
export installdir = "${base_prefix}/opt/vtView"

do_install() {
  install -d ${D}${installdir}
  install -m 0755 ${PN} ${D}${installdir}

  install -d ${D}${systemd_unitdir}/system
  install -m 0644 ${PN}.service ${D}${systemd_unitdir}/system
}

FILES_${PN} = "${base_prefix}/opt/*"
FILES_${PN} += "${systemd_unitdir}/system/vtView.service"
