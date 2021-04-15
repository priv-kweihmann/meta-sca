SUMMARY = "NPM: no-cliches"
DESCRIPTION = "Find clichés in your writings"
HOMEPAGE = "https://github.com/duereg/no-cliches"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ad1ea741b5c8f9d521103277c196d2dd"

DEPENDS = "npm-eslint-plugin-import-native \
           npm-eslint-plugin-jsx-a11y-native \
           npm-eslint-plugin-react-hooks-native \
           npm-eslint-plugin-react-native"

SRC_URI = "https://registry.npmjs.org/no-cliches/-/no-cliches-0.3.2.tgz"
SRC_URI[md5sum] = "2b384c18446198d9c68172490819a7aa"
SRC_URI[sha256sum] = "5069f1d4a8dcd1ca9f2bd06681d7b6f84c7bd697df5d6d9539317350e14a300e"

NPM_PKGNAME = "no-cliches"

inherit npmhelper
inherit native
