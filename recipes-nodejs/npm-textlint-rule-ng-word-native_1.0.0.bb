SUMMARY = "NPM: textlint-rule-ng-word"
DESCRIPTION = "textlint rule that check NG words"
HOMEPAGE = "https://github.com/KeitaMoromizato/textlint-rule-ng-word#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://registry.npmjs.org/textlint-rule-ng-word/-/textlint-rule-ng-word-1.0.0.tgz"
SRC_URI[md5sum] = "22ee72f469dd1edbf5a7eeeb57bfce0b"
SRC_URI[sha256sum] = "e100bc4831b77a1938ded01533d5ed74253909cb57c9914384e9310bd88ce26f"

NPM_PKGNAME = "textlint-rule-ng-word"

inherit npmhelper
inherit native
