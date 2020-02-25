DESCRIPTION = "A packagegroup for testing with meta-sca"

inherit packagegroup
inherit sca

PACKAGES = "\
    packagegroup-sca-test \
    "

RDEPENDS_packagegroup-sca-test = "\
    bad-javascript \
    bad-bitbake \
"
