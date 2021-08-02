SUMMARY = "The Unix security audit and intrusion detection tool"
HOMEPAGE = "http://www.nongnu.org/tiger/"

LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

DEPENDS += "bash perl"

SRC_URI = "git://git.savannah.gnu.org/git/tiger.git;protocol=https \
           file://tiger.sca.description"

SRCREV = "1ae0a295bcd6fe4e772d74b206eb10a6fb4d9a0e"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

inherit autotools-brokensep
inherit sca-description

EXTRA_OECONF += "--with-tigerhome=${datadir}/tiger \
                 --with-tigerconfig=${datadir}/tiger \
                 --with-tigerwork=${datadir}/tiger \
                 --with-tigerlog=${datadir}/tiger \
                 --with-tigerbin=${bindir} \
                 "
do_install:prepend() {
    install -d ${D}${datadir}/tiger
    install -d ${D}${bindir}
    install -d ${D}${mandir}
}

do_install:append:class-target() {
    chown -R root:root ${D}${datadir}/tiger
}

do_install:append:class-native () {
    install -d ${D}/${datadir}
    install ${WORKDIR}/tiger.sca.description ${D}${datadir}
}

FILES:${PN}:class-native += "${datadir}"

INSANE_SKIP:${PN} += "ldflags file-rdeps"

BBCLASSEXTEND = "native"
