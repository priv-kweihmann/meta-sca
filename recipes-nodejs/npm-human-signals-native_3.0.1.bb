SUMMARY = "NPM: human-signals"
DESCRIPTION = "Human-friendly process signals"
HOMEPAGE = "https://git.io/JeluP"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b6fe9ae6620c5a32b7def6338cd47e3a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/human-signals/-/human-signals-3.0.1.tgz"
SRC_URI[md5sum] = "912e183ad992ca10f2f63bab27c2ac05"
SRC_URI[sha256sum] = "576df61b76d42ae9a003338cc71156ac1227ebeed6588fb4df5ddcd37984624c"

NPM_PKGNAME = "human-signals"

inherit npmhelper
inherit native
