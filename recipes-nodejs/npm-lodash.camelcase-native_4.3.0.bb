SUMMARY = "NPM: lodash.camelcase"
DESCRIPTION = "The lodash method `_.camelCase` exported as a module."
HOMEPAGE = "https://lodash.com/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3b2b7770df62392c164de4001b59f8f"

SRC_URI = "https://registry.npmjs.org/lodash.camelcase/-/lodash.camelcase-4.3.0.tgz"
SRC_URI[md5sum] = "049ba229b0b773144dda1994f2cd2670"
SRC_URI[sha256sum] = "5062d835a19e11cf61e255b6476f232e874238dc87dbe68cd2cc2dd88be0674d"

NPM_PKGNAME = "lodash.camelcase"

inherit npmhelper
inherit native
