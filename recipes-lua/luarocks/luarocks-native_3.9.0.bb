SUMMARY = "LuaRocks is the package manager for the Lua programming language"
HOMEPAGE = "https://github.com/luarocks/luarocks"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=5a26c606953a58c545aa194713fcdfc8"

DEPENDS += "\
            curl-native \
            lua-native \
            openssl-native \
            unzip-native \
            "

SRC_URI = "git://github.com/luarocks/luarocks;branch=master;protocol=https"
SRCREV = "b2a271cc9798e56c443ace6e0a50f13148bf4bb2"

S = "${WORKDIR}/git"

inherit native

do_configure() {
    ./configure --prefix=${prefix}
}

do_compile() {
    oe_runmake
}

do_install() {
    oe_runmake install DESTDIR=${D}
}

FILES:${PN} += "${sysconfdir} ${bindir} ${datadir} ${libdir}"
