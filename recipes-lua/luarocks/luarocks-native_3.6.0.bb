SUMMARY = "LuaRocks is the package manager for the Lua programming language"
HOMEPAGE = "https://github.com/luarocks/luarocks"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=5a26c606953a58c545aa194713fcdfc8"

DEPENDS += "\
            curl-native \
            lua-native \
            openssl-native \
            unzip-native \
            "

SRC_URI = "git://github.com/luarocks/luarocks;protocol=https"
SRCREV = "de246955642afccc99cf08d7ae6b92104f6051f8"

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

FILES_${PN} += "${sysconfdir} ${bindir} ${datadir} ${libdir}"
