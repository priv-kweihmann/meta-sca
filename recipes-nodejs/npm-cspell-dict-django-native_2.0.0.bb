SUMMARY = "NPM: @cspell/dict-django"
DESCRIPTION = "Django dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/django#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=feb6031da5a5e2cf8141a1833f070416"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-django/-/dict-django-2.0.0.tgz"
SRC_URI[md5sum] = "e0889b1b617a185975dfdd4fb86b765b"
SRC_URI[sha256sum] = "85459469e1cf3faaba65e4801a37fedb097ff76066fd2e49426f593766f5c824"

NPM_PKGNAME = "@cspell/dict-django"

inherit npmhelper
inherit native
