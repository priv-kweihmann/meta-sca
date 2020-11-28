SUMMARY = "NPM: cspell-dict-django"
DESCRIPTION = "Django dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/django#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8e46c7bc7d07e1763d0810c3ec8a4799"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-django/-/cspell-dict-django-1.0.24.tgz"
SRC_URI[md5sum] = "47047b97b0d25c5333ee4315b6aeeaf5"
SRC_URI[sha256sum] = "9293529b39d85946c8760331acb943f823910a0d19e0ce73c5ce03f1a12c4d76"

NPM_PKGNAME = "cspell-dict-django"

inherit npmhelper
inherit native
