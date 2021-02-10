SUMMARY = "Sparse - a Semantic Parser for C"
HOMEPAGE = "https://sparse.wiki.kernel.org/index.php/Main_Page"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=69a9605316748b9e191e454efc2235b1"

SRC_URI = "git://git.kernel.org/pub/scm/devel/sparse/sparse.git;protocol=https \
           file://sparse.sca.description"
SRCREV = "c3b7facda6adfdbf56c1c158a04a3a648fac6f3f"
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

FILES_${PN} = "${bindir} ${datadir}"
