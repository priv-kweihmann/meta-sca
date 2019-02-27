SUMMARY = "Tool for checking elf-symbols against rules"
HOMEPAGE = "https://github.com/priv-kweihmann/pysymbolcheck"

SRC_URI = "git://github.com/priv-kweihmann/pysymbolcheck.git;protocol=http;branch=master;tag=${PV}"

PV = "1.2"

S = "${WORKDIR}/git"
B = "${S}"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e926c89aceef6c1a4247d5df08f94533"

inherit native

RDEPENDS_${PN} += "python3-core-native jsonmerge-native pyelftools-native python3-ctypes-native"
FILES_${PN} = "${bindir}"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    mkdir -p ${D}${bindir}/pysymbolcheck
    cp -R ${B}/* ${D}${bindir}/pysymbolcheck
}
