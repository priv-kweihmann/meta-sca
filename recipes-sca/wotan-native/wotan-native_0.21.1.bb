SUMMARY = "Pluggable TypeScript and JavaScript linter"

HOMEPAGE = "https://github.com/fimbullinter/wotan"

inherit npm-helper

SRC_URI = "git://github.com/fimbullinter/wotan.git;protocol=https;tag=v${PV} \
           file://modules_${BPN}-${PV}.tar.gz;subdir=git \
           file://wotan.sca.description"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM  = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

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
    npm install --prefix ${D}${prefix} -g ${NPM_EXTRA_ARGS} --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production @fimbul/wotan @fimbul/valtyr @fimbul/ve
    npm install --prefix ${D}${prefix} -g ${NPM_EXTRA_ARGS} --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production typescript@3.6.3
    if [ -d ${D}${prefix}/etc ] ; then
        # This will be empty
        rmdir ${D}${prefix}/etc
    fi

    mkdir -p ${D}${datadir}

    install ${WORKDIR}/wotan.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
