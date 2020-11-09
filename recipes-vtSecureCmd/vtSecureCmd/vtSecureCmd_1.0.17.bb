DESCRIPTION = "Virtium vtSecureCmd program."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=3da9cfbcb788c80a0384361b4de20420"

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"

PR = "r1"

SRC_URI = "file://COPYING ftp://10.10.33.13/public/${PN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "6bd84c97c839880f1ad2ab38b9302efe"
SRC_URI[sha256sum] = "4d7d9b1f066b57be4f2e09163a068815ea196a613ae297b70744011fb63c6540"

S = "${WORKDIR}"

do_install() {
  install -d ${D}${bindir}
  install -m 0755 ${PN} ${D}${bindir}
}
