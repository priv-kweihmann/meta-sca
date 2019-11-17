SUMMARY = "A Spell Checker for Code!"
DESCRIPTION = "A Spell Checker for Code!"
HOMEPAGE = "https://github.com/Jason3S/cspell"

SRC_URI = "git://github.com/streetsidesoftware/cspell.git;protocol=https;tag=v${PV} \
           file://cspell.sca.description \
           file://cspell.sca.score"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://git/LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS += "nodejs-native"

inherit native
inherit sca-sanity

S = "${WORKDIR}"

do_compile() {
    :
}

do_install() {
    export HOME=${WORKDIR}
    cd ${WORKDIR}
	mkdir -p ${D}${libdir}/node_modules
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production ${BPN}@${PV}
	if [ -d ${D}${prefix}/etc ] ; then
		# This will be empty
		rmdir ${D}${prefix}/etc
	fi

    mkdir -p ${D}${datadir}

    install ${WORKDIR}/cspell.sca.description ${D}${datadir}
    install ${WORKDIR}/cspell.sca.score ${D}${datadir}
}

FILES_${PN} += "${datadir}"


