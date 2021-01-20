DESCRIPTION = "Virtium vtSecureCmd program."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=3da9cfbcb788c80a0384361b4de20420"

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"

PR = "r1"

SRC_URI = "file://COPYING ftp://10.10.33.13/public/arm/vtsecurecmd-${PV}.tar.bz2"
SRC_URI[md5sum] = "385036f54d62b7ad0d31fd0d4b922318"
SRC_URI[sha256sum] = "36236fe4c5ac015d3175df9de284bd8974f5d8319f3e41a962fc867e1b2010bb"

S = "${WORKDIR}"

do_install() {
  install -d ${D}${bindir}
  install -m 0755 vtSecureCmd ${D}${bindir}
}
