SUMMARY = "NPM: pkg-config"
DESCRIPTION = "parse the closest `package.json` and get package specific configurations"
HOMEPAGE = "https://github.com/ahmadnassri/pkg-config"

DEPENDS = "npm-debug-log-native npm-find-root-native npm-xtend-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a667e82e1fc400f05d42ee009ff065bc"

SRC_URI = "https://registry.npmjs.org/pkg-config/-/pkg-config-1.1.1.tgz"
SRC_URI[md5sum] = "f00116bb9bf214290d26606d61b71e42"
SRC_URI[sha256sum] = "6e9db2e750347a6119e8edfea116485a649b9125123675a6dfdc1717add68e1d"

NPM_PKGNAME = "pkg-config"

inherit npmhelper
inherit native
