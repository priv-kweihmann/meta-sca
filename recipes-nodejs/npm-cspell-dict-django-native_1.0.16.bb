SUMMARY = "NPM: cspell-dict-django"
DESCRIPTION = "Django dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/django#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9f0d19b8001b71df7bfa66b3e4df3454"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-django/-/cspell-dict-django-1.0.16.tgz"
SRC_URI[md5sum] = "457865c26c9924dfdacac04504a00293"
SRC_URI[sha256sum] = "2eab3a8fdbd29d46f0ac4c435ba7d2372d79a18afe35bf3fc5b6d9d8d6bbbae1"

NPM_PKGNAME = "cspell-dict-django"

inherit npmhelper
inherit native
