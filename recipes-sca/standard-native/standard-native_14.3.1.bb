SUMMARY = "JavaScript Style Guide, with linter & automatic code fixer"
DESCRIPTION = "JavaScript Style Guide, with linter & automatic code fixer"
HOMEPAGE = "https://github.com/standard/standard"

inherit npm-helper

SRC_URI = "git://github.com/standard/standard.git;protocol=https;tag=v${PV} \
           file://modules_${BPN}-${PV}.tar.gz;subdir=git \
           file://standard.sca.description"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://LICENSE;md5=fb42e5aa12bb9e365d38b4b5691d6984"

DEPENDS += "nodejs-native"

inherit native
inherit sca-sanity

S = "${WORKDIR}/git"

do_compile() {
    :
}

do_install() {
    export HOME=${S}
    cd ${S}
    npm install --prefix ${D}${prefix} -g ${NPM_EXTRA_ARGS} --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production ${BPN}@${PV}
	if [ -d ${D}${prefix}/etc ] ; then
		# This will be empty
		rmdir ${D}${prefix}/etc
	fi

    mkdir -p ${D}${datadir}

    install ${WORKDIR}/standard.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"