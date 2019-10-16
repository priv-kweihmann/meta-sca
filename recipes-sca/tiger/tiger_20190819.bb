SUMMARY = "The Unix security audit and intrusion detection tool"
HOMEPAGE = "http://www.nongnu.org/tiger/"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

SRC_URI = "git://git.savannah.gnu.org/tiger.git;protocol=https \
           file://tiger.sca.description \
           file://tiger.sca.score"
SRCREV = "1ae0a295bcd6fe4e772d74b206eb10a6fb4d9a0e"
S = "${WORKDIR}/git"

inherit autotools-brokensep

EXTRA_OECONF += "--with-tigerhome=${datadir}/tiger \
				 --with-tigerconfig=${datadir}/tiger \
				 --with-tigerwork=${datadir}/tiger \
  				 --with-tigerlog=${datadir}/tiger \
				 --with-tigerbin=${bindir} \
				 "
do_install_prepend() {
	mkdir -p ${D}${datadir}/tiger
	mkdir -p ${D}${bindir}
	mkdir -p ${D}${mandir}
}

do_install_append_class-target() {
	chown -R root:root ${D}${datadir}/tiger
}

do_install_append_class-native () {
	install -d ${D}/${datadir}

    install ${WORKDIR}/tiger.sca.description ${D}${datadir}
    install ${WORKDIR}/tiger.sca.score ${D}${datadir}
}

INSANE_SKIP_${PN} += "ldflags file-rdeps"

DEPENDS += "bash perl"

FILES_${PN}_class-native += "${datadir}"

BBCLASSEXTEND = "native"