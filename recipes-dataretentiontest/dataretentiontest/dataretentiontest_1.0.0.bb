DESCRIPTION = "Virtium data retention test script."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=3da9cfbcb788c80a0384361b4de20420"

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"

PR = "r1"

SRC_URI = "file://COPYING ftp://10.10.33.13/public/arm/dataretentiontest-${PV}.tar.bz2"
SRC_URI[md5sum] = "a5cf207547f40d21c54948063d7bd95c"
SRC_URI[sha256sum] = "5e029ff939a72bca5f529aed931727daf517d877ae8dc63404b1a72e29479c38"

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

