SUMMARY = "NPM: js-yaml"
DESCRIPTION = "YAML 1.2 parser and serializer"
HOMEPAGE = "https://github.com/nodeca/js-yaml"

DEPENDS = "npm-argparse-native npm-esprima-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=effd621a9bf5d72d6a7e6ef819bf3afb"

SRC_URI = "https://registry.npmjs.org/js-yaml/-/js-yaml-3.13.1.tgz"
SRC_URI[md5sum] = "417ec87ed4f32cc0762965b35d41dd46"
SRC_URI[sha256sum] = "662e32319bdd378e91f67578e56a34954b0a2e33aca11d70ab9f4826af24b941"

NPM_PKGNAME = "js-yaml"

inherit npmhelper
inherit native
