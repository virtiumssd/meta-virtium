DESCRIPTION = "Virtium sanitize demonstration script."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=3da9cfbcb788c80a0384361b4de20420"

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"

PR = "r1"

SRC_URI = "file://COPYING ftp://10.10.33.13/public/arm/sanitizedemonstration-${PV}.tar.bz2"
SRC_URI[md5sum] = "6515c7544a04e5b9fb214921369336ce"
SRC_URI[sha256sum] = "9dde1b7b46e8045ddf94e2c74f155b58d660733c2cf2e96ec876790d1cfd5f84"

S = "${WORKDIR}"
export installdir = "${base_prefix}/opt/sanitize-demonstration"

do_install() {
  install -d ${D}${installdir}
  install -m 0644 sanitize-demonstration.py ${D}${installdir}
  install -m 0644 sanitize-demonstration.mp4 ${D}${installdir}

  install -d ${D}${bindir}
  install -m 0755 vtSanitizeDemonstration.sh ${D}${bindir}
}

RDEPENDS_${PN} = "bash"
FILES_${PN} = "${base_prefix}/opt/*"
FILES_${PN} += "${base_prefix}/usr/bin/*"

