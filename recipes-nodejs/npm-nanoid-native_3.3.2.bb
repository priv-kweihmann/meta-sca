SUMMARY = "NPM: nanoid"
DESCRIPTION = "A tiny (130 bytes), secure URL-friendly unique string ID generator"
HOMEPAGE = "https://github.com/ai/nanoid#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=237c21016e56a1ee4475a39fc00d1504"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/nanoid/-/nanoid-3.3.2.tgz"
SRC_URI[md5sum] = "4a8a7efed815e9d517af85e0c1ab3edd"
SRC_URI[sha256sum] = "95826d54ed2691dc52b4aedb7ac61a81ec64cc63347e79f0e1c8a73eaea07690"

NPM_PKGNAME = "nanoid"

inherit npmhelper
inherit native
