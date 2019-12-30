SUMMARY = "scanner detecting the use of JavaScript libraries with known vulnerabilities"
HOMEPAGE = "https://github.com/RetireJS/retire.js"

inherit npm-helper

SRC_URI = "git://github.com/RetireJS/retire.js.git;protocol=https;tag=${PV} \
           file://modules_${BPN}-${PV}.tar.gz;subdir=git \
           file://retire.sca.description"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM  = "file://LICENSE.md;md5=6ab42c2b3308255529a8db4ee37e13a1"

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

    install ${WORKDIR}/retire.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"