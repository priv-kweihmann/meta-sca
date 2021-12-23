SUMMARY = "mikesxrs YARA Rules Collection"
HOMEPAGE = "https://github.com/mikesxrs/Open-Source-YARA-rules"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Unlicense"

LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/files/licenses/Unlicense;md5=1d267ceb3a8d8f75f1be3011ee4cbf53"

SRC_URI = "git://github.com/mikesxrs/Open-Source-YARA-rules.git;branch=master;protocol=https"
SRCREV = "3ab2b7ffb42c587943ae0bd36b91520f74df26b6"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

inherit native

do_configure() {
    :
}

do_compile() {
    ## Replace all blanks with underlines in source repo
    find ${S} -type d -name "* *" -print | awk '{print;gsub(" ","_",$0);print}' | xargs -r -n2 -d "\n" mv
    find ${S} -name "* *" -print | awk '{print;gsub(" ","_",$0);print}' | xargs -r -n2 -d "\n" mv
}

do_install () {
    install -d ${D}/${datadir}/yara-rules
    cd ${S}
    for f in $(find . -type f); do
        _f=$(echo "$f" | sed "s#^./##g")
        [ ! -z $(dirname $_f ) ] && install -d ${D}${datadir}/yara-rules/$(dirname $_f)
        install $_f ${D}${datadir}/yara-rules/$_f
    done
    cd -
}

RDEPENDS:${PN} += "bash-native perl-native"
