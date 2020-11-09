DESCRIPTION = "Virtium vtTestCmd program."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=3da9cfbcb788c80a0384361b4de20420"

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"

PR = "r1"

SRC_URI = "file://COPYING ftp://10.10.33.13/public/vttestcmd-${PV}.tar.bz2"
SRC_URI[md5sum] = "f4f9ad05aeb16c4062f370b4af527974"
SRC_URI[sha256sum] = "48143c6834996ba3a046a77c39bf67cdb92f031af5ae2cdeedfd4cab556bc518"

S = "${WORKDIR}"

do_install() {
  install -d ${D}${bindir}
  install -m 0755 vtTestCmd ${D}${bindir}
}
