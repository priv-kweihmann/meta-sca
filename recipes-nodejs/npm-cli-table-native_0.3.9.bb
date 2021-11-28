SUMMARY = "NPM: cli-table"
DESCRIPTION = "Pretty unicode tables for the CLI"
HOMEPAGE = "https://github.com/Automattic/cli-table#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7426c3e07cd555a7113d8e4740f8bf6a"

DEPENDS = "npm-colors-native \
           npm-strip-ansi-native"

SRC_URI = "https://registry.npmjs.org/cli-table/-/cli-table-0.3.9.tgz"
SRC_URI[md5sum] = "d012b82a88273c9d0e1bf791002323e7"
SRC_URI[sha256sum] = "f17cb06140b22025154c859372f0eed077ff109c77e79e08f1846b8ca766ba95"

NPM_PKGNAME = "cli-table"

inherit npmhelper
inherit native
