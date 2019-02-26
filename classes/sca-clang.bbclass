python sca_clang_init() {
    import os
    import bb
    import glob
    from bb.parse.parse_py import BBHandler

    ## Find out if we need to inherit the core-class or not
    for item in d.getVar("BBLAYERS").split(" "):
        if not item.strip():
            continue
        if any(glob.glob(item.strip() + "/**/clang/clang_git.bb", recursive=True)):
            BBHandler.inherit("sca-clang-core", "sca_clang_init", 1, d)
            return
    bb.note("SCA: clang will be disabled because meta-clang-layer cannot be found\nPlease clone it from https://github.com/kraj/meta-clang")
    raise bb.parse.ParseError("","", 0)
}