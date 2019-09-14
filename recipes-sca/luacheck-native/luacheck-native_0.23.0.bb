SUMMARY = "A tool for linting and static analysis of Lua code"

HOMEPAGE = "https://github.com/mpeterv/luacheck"

SRC_URI = "git://github.com/mpeterv/luacheck.git;protocol=https;tag=${PV} \
           file://luacheck.sca.description \
           file://luacheck.sca.score"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78c1d9d1063a2e3c98965716ac8494f0"

S = "${WORKDIR}/git"

inherit native
inherit luarocks

do_install_append() {
    ## We need to tweak some hardcoded paths in the luacheck wrapper
    sed -i "s#${D}##g" ${D}${bindir}/luacheck
    ## Install tool description
    mkdir -p ${D}${datadir}
    install ${WORKDIR}/luacheck.sca.description ${D}${datadir}/
    install ${WORKDIR}/luacheck.sca.score ${D}${datadir}/
}

