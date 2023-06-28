SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'bandit', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'bashate', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'bitbake', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'cbmc', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'checkbashism', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'cmake', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'cppcheck', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'cpplint', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'cvecheck', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'darglint', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'dennis', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'detectsecrets', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'flake8', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'flawfinder', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'flint', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'gcc', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'golint', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'it', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'jsonlint', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'kconfighard', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'licensecheck', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'looong', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'msgcheck', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'multimetric', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'mypy', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'oelint', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'perl', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'perlcritic', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'pscan', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'pylint', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'pysymcheck', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'rats', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'reuse', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'revive', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'scancode', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'setuptoolslint', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'shellcheck', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'slick', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'sparse', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'stank', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'systemdlint', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'tlv', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'tscancode', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'vulture', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'xmllint', '')}"
SCA_ENABLED_MODULES:remove:class-nativesdk = "${@oe.utils.ifelse(not bb.data.inherits_class('packagegroup', d), 'yamllint', '')}"

# Run certain sca modules on our nativesdk recipes
inherit ${@oe.utils.ifelse('/meta-sca/' in d.getVar('FILE') and not bb.data.inherits_class('packagegroup', d), 'sca', '')}

# override the standard function here
python do_sca_pkgqaenc:class-nativesdk() {
    results = oe.utils.multiprocess_launch(do_sca_pkgqaenc_pkg_process, clean_split(d, "PACKAGES"), d, extraargs=(d,))
    cmd_output = "\n".join(results)
    cmd_output += do_sca_pkgqaenc_hashdog(d)

    with open(sca_raw_result_file(d, "pkgqaenc"), "w") as o:
        o.write(cmd_output)
    
    for item in results:
        if item.startswith("INFO:"):
            continue
        bb.warn(item)
}