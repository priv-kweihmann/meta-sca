SUMMARY = "NPM: argparse"
DESCRIPTION = "Very powerful CLI arguments parser. Native port of argparse - python's options parsing library"
HOMEPAGE = "https://github.com/nodeca/argparse#readme"

DEPENDS = "npm-sprintf-js-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a2f2590d8d82b0fa2b3e2fc5c69d2b81"

SRC_URI = "https://registry.npmjs.org/argparse/-/argparse-1.0.10.tgz"
SRC_URI[md5sum] = "d96ffb030eff598e8f3eb48b6257bdaf"
SRC_URI[sha256sum] = "7faa149cd7811b7e11fc8353dc6e4e9c4de68a02f8221aa8f7dc22108315ac0d"

NPM_PKGNAME = "argparse"

inherit npmhelper
inherit native
