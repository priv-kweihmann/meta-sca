SUMMARY = "NPM: cspell-dict-django"
DESCRIPTION = "Django dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/django#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9f0d19b8001b71df7bfa66b3e4df3454"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-django/-/cspell-dict-django-1.0.21.tgz"
SRC_URI[md5sum] = "e62531e1020c7b6ed8dd773fb06745ed"
SRC_URI[sha256sum] = "c1e25a0e747dfc2557ef8d350c13e29ef9c1fef0d738fdf98e719cbcaedb6f8f"

NPM_PKGNAME = "cspell-dict-django"

inherit npmhelper
inherit native
