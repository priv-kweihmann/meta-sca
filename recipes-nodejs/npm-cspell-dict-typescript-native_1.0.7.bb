SUMMARY = "NPM: cspell-dict-typescript"
DESCRIPTION = "TypeScript and JavaScript dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/typescript#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-typescript/-/cspell-dict-typescript-1.0.7.tgz"
SRC_URI[md5sum] = "7c5f374b8de3f4d211cfdd19e30f9f7f"
SRC_URI[sha256sum] = "c6963166244419f39fd37c584622cbe3cdf4b7d2b94a5a8c3a61ea6bb14e7c10"

NPM_PKGNAME = "cspell-dict-typescript"

inherit npmhelper
inherit native
