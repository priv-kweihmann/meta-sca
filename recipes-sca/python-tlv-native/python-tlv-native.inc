SUMMARY = "Too less variation - A tool to discover code duplication in various languages"
DESCRIPTION = "Too less variation - A tool to discover code duplication in various languages"
HOMEPAGE = "https://github.com/priv-kweihmann/systemdlint"

SRC_URI = "git://github.com/priv-kweihmann/tlv.git;protocol=https;branch=master;tag=${PV} \
           file://tlv.sca.description"

S = "${WORKDIR}/git"
B = "${S}"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=1e0b805e34c99594e846fa46c20d8b9b"

inherit native
inherit sca-sanity

DEPENDS += "${PYTHON_PN}-pygments-native"

RDEPENDS_${PN} += "${PYTHON_PN}-core-native"

FILES_${PN} += "${datadir}"

do_fake_pandoc() {
    cd ${B}
    cat << EOF > ${STAGING_BINDIR_NATIVE}/pandoc
#!/bin/sh
exit -1
EOF
    chmod +x ${STAGING_BINDIR_NATIVE}/pandoc
    cd -
}

addtask do_fake_pandoc before do_compile after do_patch

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/tlv.sca.description ${D}${datadir}
}
