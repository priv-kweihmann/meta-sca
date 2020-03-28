SUMMARY = "Sparse - a Semantic Parser for C"
DESCRIPTION = "Sparse - a Semantic Parser for C"

HOMEPAGE = "https://sparse.wiki.kernel.org/index.php/Main_Page"

LICENSE = "MIT"

SRC_URI = "git://git.kernel.org/pub/scm/devel/sparse/sparse.git;protocol=https;tag=v${PV} \
           file://sparse.sca.description"

LIC_FILES_CHKSUM = "file://LICENSE;md5=69a9605316748b9e191e454efc2235b1"

inherit native
inherit pkgconfig
inherit sca-sanity

S = "${WORKDIR}/git"

do_compile() {
	oe_runmake
}

FILES_${PN} = "${bindir} ${mandir} ${datadir}"

do_install() {
    oe_runmake install DESTDIR=${D} PREFIX=${exec_prefix}

    install -d ${D}${datadir}
    install ${WORKDIR}/sparse.sca.description ${D}${datadir}
}
