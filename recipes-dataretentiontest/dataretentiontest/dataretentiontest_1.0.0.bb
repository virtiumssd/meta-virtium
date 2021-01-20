DESCRIPTION = "Virtium data retention test script."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=3da9cfbcb788c80a0384361b4de20420"

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"

PR = "r1"

SRC_URI = "file://COPYING ftp://10.10.33.13/public/x86-64/dataretentiontest-${PV}.tar.bz2"
SRC_URI[md5sum] = "0df71c5700ec37a508cf6df566f7e141"
SRC_URI[sha256sum] = "9bc7d1df478d3a74dbe9ce954e9d74858583aa4c2af7a7419a891572daf8a03f"

S = "${WORKDIR}"
export installdir = "${base_prefix}/opt/data-retention-test"

do_install() {
  install -d ${D}${installdir}
  install -m 0644 data-retention-test.py ${D}${installdir}
  install -m 0755 coredelegate-sample ${D}${installdir}
  install -m 0644 data-retention-test-record.mp4 ${D}${installdir}

  install -d ${D}${bindir}
  install -m 0755 vtDataRetentionTest.sh ${D}${bindir}
}

RDEPENDS_${PN} = "bash"
FILES_${PN} = "${base_prefix}/opt/*"
FILES_${PN} += "${base_prefix}/usr/bin/*"

