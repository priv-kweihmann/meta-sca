SCA_AVAILABLE_MODULES ?= "pkgqaenc"

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