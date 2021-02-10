SUMMARY = "A tool for linting and static analysis of Lua code"
HOMEPAGE = "https://github.com/mpeterv/luacheck"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78c1d9d1063a2e3c98965716ac8494f0"

SRC_URI = "git://github.com/mpeterv/luacheck.git;protocol=https \
           file://luacheck.sca.description"
SRCREV = "76bb56736702e8651537b2a9c10ae55ab7dc1d5d"

S = "${WORKDIR}/git"

inherit luarocks
inherit sca-description
inherit native

do_install_append() {
    ## We need to tweak some hardcoded paths in the luacheck wrapper
    sed -i "s#${D}##g" ${D}${bindir}/luacheck
    ## Install tool description
    install -d ${D}${datadir}
    install ${WORKDIR}/luacheck.sca.description ${D}${datadir}/
}
