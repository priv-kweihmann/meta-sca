SUMMARY = "NPM: cspell-dict-python"
DESCRIPTION = "Python dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/python#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-python/-/cspell-dict-python-1.1.9.tgz"
SRC_URI[md5sum] = "3b479bdb6e322a0f63dd0b820f392707"
SRC_URI[sha256sum] = "b01776e6eec8b7fd4799ba7651ae90f6e977253d28a82ccdb6973d38290786f7"

NPM_PKGNAME = "cspell-dict-python"

inherit npmhelper
inherit native
