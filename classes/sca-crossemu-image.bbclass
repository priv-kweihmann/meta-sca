inherit sca-license-image-helper
inherit sca-helper
inherit qemu

def _get_pkgs_list(d, pkg):
    ## Extract the not installed packages
    import oe.packagedata
    res = [ pkg ]
    try:
        pkgdata = oe.packagedata.read_subpkgdata_dict(pkg, d)
        if "deps" in pkgdata.keys():
            for _dep in pkgdata["deps"]:
                res += _get_pkgs_list(d, _dep)
    except Exception as e:
        bb.warn(str(e))
    return list(set(res))

def do_sca_create_crossemu_img(d, tool, addpkgs, postcmd=""):
    import shutil
    import os
    import json
    from copy import copy
    import logging
    from oe.rootfs import create_rootfs
    from oe.manifest import create_manifest
    from oe.utils import execute_pre_post_process
    ## Create a copy of the rootfs
    _target_path = os.path.join(d.getVar("WORKDIR"), "rootfs_{}".format(tool))
    if os.path.exists(_target_path):
        shutil.rmtree(_target_path, ignore_errors=True)

    pkg_list = []
    ## Get additional packages + deps
    for p in addpkgs:
        pkg_list += _get_pkgs_list(d, p)

    dc = copy(d)
    dc.appendVar("PACKAGE_INSTALL", " " + " ".join(pkg_list))
    dc.setVar("IMAGE_ROOTFS", _target_path)

    logger = dc.getVar('BB_TASK_LOGGER', False)
    if logger:
        logcatcher = bb.utils.LogCatcher()
        logger.addHandler(logcatcher)
    else:
        logcatcher = None

    # Ensure we handle package name remapping
    # We have to delay the runtime_mapping_rename until just before rootfs runs
    # otherwise, the multilib renaming could step in and squash any fixups that
    # may have occurred.
    pn = dc.getVar('PN')
    runtime_mapping_rename("PACKAGE_INSTALL", pn, dc)
    runtime_mapping_rename("PACKAGE_INSTALL_ATTEMPTONLY", pn, dc)
    runtime_mapping_rename("BAD_RECOMMENDATIONS", pn, dc)

    # Generate the initial manifest
    create_manifest(dc)

    # generate rootfs
    dc.setVarFlag('REPRODUCIBLE_TIMESTAMP_ROOTFS', 'export', '1')
    create_rootfs(dc, progress_reporter=None, logcatcher=logcatcher)

    execute_pre_post_process(dc, postcmd)

    _qemu = "{}-static".format(qemu_target_binary(d))
    shutil.copy(os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), _qemu),
                os.path.join(_target_path, _qemu))

    return _target_path
