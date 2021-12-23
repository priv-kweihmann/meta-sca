SUMMARY = "NPM: cspell-dict-django"
DESCRIPTION = "Django dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/django#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8e46c7bc7d07e1763d0810c3ec8a4799"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-django/-/cspell-dict-django-1.1.3.tgz"
SRC_URI[md5sum] = "3f657da627b33f6d87c38e85ff1d15d1"
SRC_URI[sha256sum] = "80d146077d0399a686691017faef4e557da7d0ac2d4e207f26dedea2d1c93a6e"

NPM_PKGNAME = "cspell-dict-django"

inherit npmhelper
inherit native
