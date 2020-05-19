SUMMARY = "NPM: dotfile-regex"
DESCRIPTION = "Regular expresson for matching dotfiles."
HOMEPAGE = "https://github.com/regexps/dotfile-regex"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=43;endline=44;md5=44cb26eb442376d4183af722b89e09d9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dotfile-regex/-/dotfile-regex-0.1.2.tgz"
SRC_URI[md5sum] = "39ed18eb17718b17908fea8aae3cab91"
SRC_URI[sha256sum] = "a6f1122233ff529bb01555ad646a1ce0865046e79eaf5ea63afd4e92d0902d5f"

NPM_PKGNAME = "dotfile-regex"

inherit npmhelper
inherit native
