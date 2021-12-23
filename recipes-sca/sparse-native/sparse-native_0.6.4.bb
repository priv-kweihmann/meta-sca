SUMMARY = "Sparse - a Semantic Parser for C"
HOMEPAGE = "https://sparse.wiki.kernel.org/index.php/Main_Page"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=69a9605316748b9e191e454efc2235b1"

SRC_URI = "git://git.kernel.org/pub/scm/devel/sparse/sparse.git;branch=master;protocol=https \
           file://sparse.sca.description"
SRCREV = "c4706aa764f3ae68258ba60be6325a5662900362"
S = "${WORKDIR}/git"

inherit pkgconfig
inherit sca-description
inherit native

do_compile() {
    oe_runmake
}

do_install() {
    oe_runmake install DESTDIR=${D} PREFIX=${exec_prefix}

    install -d ${D}${datadir}
    install ${WORKDIR}/sparse.sca.description ${D}${datadir}
}

FILES:${PN} = "${bindir} ${datadir}"
