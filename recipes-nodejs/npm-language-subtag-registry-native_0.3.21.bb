SUMMARY = "NPM: language-subtag-registry"
DESCRIPTION = "Full BCP 47 language subtag data from the official IANA repository, in JSON format with multiple indices."
HOMEPAGE = "https://github.com/mattcg/language-subtag-registry"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ODC-By-1.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=9dd6529fc4138a7799bb7c0aac21d9ab"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/language-subtag-registry/-/language-subtag-registry-0.3.21.tgz"
SRC_URI[md5sum] = "eac105a4a99324b17e4dfade6b599a1e"
SRC_URI[sha256sum] = "36d49820f5bd01e5d3e3df384bf74969cd1fd1035447368195cd9d86bc7c3fb7"

NPM_PKGNAME = "language-subtag-registry"

inherit npmhelper
inherit native
