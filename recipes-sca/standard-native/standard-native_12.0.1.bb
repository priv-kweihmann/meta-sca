SUMMARY = "JavaScript Style Guide, with linter & automatic code fixer"
DESCRIPTION = "JavaScript Style Guide, with linter & automatic code fixer"
HOMEPAGE = "https://github.com/standard/standard"

SRC_URI = "git://github.com/standard/standard.git;protocol=https;tag=v${PV} \
           file://standard.sca.description \
           file://standard.sca.score"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://git/LICENSE;md5=fb42e5aa12bb9e365d38b4b5691d6984"

DEPENDS += "nodejs-native"

inherit native

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

    install ${WORKDIR}/standard.sca.description ${D}${datadir}
    install ${WORKDIR}/standard.sca.score ${D}${datadir}
}

FILES_${PN} += "${datadir}"