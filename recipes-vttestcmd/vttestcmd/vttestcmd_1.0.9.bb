DESCRIPTION = "Virtium vtTestCmd program."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=3da9cfbcb788c80a0384361b4de20420"

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"

PR = "r1"

SRC_URI = "file://COPYING ftp://10.10.33.13/public/arm/vttestcmd-${PV}.tar.bz2"
SRC_URI[md5sum] = "5db1e7abb99519a45edb3c96962a7c30"
SRC_URI[sha256sum] = "2c62024468de344e330322af2755f42d7b7c034e62777e353c643b2b05fa6c1f"

S = "${WORKDIR}"

do_install() {
  install -d ${D}${bindir}
  install -m 0755 vtTestCmd ${D}${bindir}
}
