SUMMARY = "NPM: cspell-dict-django"
DESCRIPTION = "Django dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/django#readme"

DEPENDS = "npm-configstore-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9f0d19b8001b71df7bfa66b3e4df3454"

SRC_URI = "https://registry.npmjs.org/cspell-dict-django/-/cspell-dict-django-1.0.15.tgz"
SRC_URI[md5sum] = "a684d861a25740a9c33d6dbd4ffbe24f"
SRC_URI[sha256sum] = "47237f2ea471e7fe9cda89cec91fdc5c15f486d9a45f261bf1970bd3cd775f5c"

S = "${WORKDIR}/package"

NPM_PKGNAME = "cspell-dict-django"

inherit npmhelper
inherit native
