SUMMARY = "NPM: cspell-dict-django"
DESCRIPTION = "Django dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/django#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8e46c7bc7d07e1763d0810c3ec8a4799"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-django/-/cspell-dict-django-1.1.2.tgz"
SRC_URI[md5sum] = "0858868febb19528efb5e2dd542769a7"
SRC_URI[sha256sum] = "f6af7cc3871c0b496a3acbba028af9ad9d2912eafa183a170db93ab669bc8ddd"

NPM_PKGNAME = "cspell-dict-django"

inherit npmhelper
inherit native
