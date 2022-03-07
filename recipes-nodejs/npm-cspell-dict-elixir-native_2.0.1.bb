SUMMARY = "NPM: @cspell/dict-elixir"
DESCRIPTION = "Elixir dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/elixir#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=acfbf4bfa9578f50e7ce529644121342"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-elixir/-/dict-elixir-2.0.1.tgz"
SRC_URI[md5sum] = "67e17129e1b175e11ea14f83e78ab1b4"
SRC_URI[sha256sum] = "09f28f47e9467a93846df3c4717557a8a1a3691b5d0e90c02046d0cc898031ee"

NPM_PKGNAME = "@cspell/dict-elixir"

inherit npmhelper
inherit native
