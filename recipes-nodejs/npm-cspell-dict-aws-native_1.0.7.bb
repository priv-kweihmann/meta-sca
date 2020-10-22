SUMMARY = "NPM: cspell-dict-aws"
DESCRIPTION = "AWS dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/aws#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c6da5c48319e04dd28e31b74cb7b8468"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-aws/-/cspell-dict-aws-1.0.7.tgz"
SRC_URI[md5sum] = "22a1ed3c7385ccf66299fa019ae903f8"
SRC_URI[sha256sum] = "db07934edbfae7a48eb8df9d8e9e155554be92a5083ff8c8206da29e96d8c938"

NPM_PKGNAME = "cspell-dict-aws"

inherit npmhelper
inherit native
