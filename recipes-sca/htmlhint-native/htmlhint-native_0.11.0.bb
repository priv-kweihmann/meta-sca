SUMMARY = "The static code analysis tool you need for your HTML"
DESCRIPTION = "The static code analysis tool you need for your HTML"
HOMEPAGE = "https://github.com/htmlhint/HTMLHint"

inherit npm-helper

SRC_URI = "git://github.com/htmlhint/HTMLHint.git;protocol=https;tag=v${PV} \
           file://modules_${BPN}-${PV}.tar.gz;subdir=git \
           file://htmlhint.sca.description \
           file://htmlhint.sca.score"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://LICENSE.md;md5=9ab22e524b729e8ba6a68fda798ad089"

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

    install ${WORKDIR}/htmlhint.sca.description ${D}${datadir}
    install ${WORKDIR}/htmlhint.sca.score ${D}${datadir}
}

FILES_${PN} += "${datadir}"
