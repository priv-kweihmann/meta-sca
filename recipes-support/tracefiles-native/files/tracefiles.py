#!/usr/bin/env nativepython3
# BSD 2-Clause License
#
# Copyright (c) 2020, Konrad Weihmann
# All rights reserved.
#
# Redistribution and use in source and binary forms, with or without
# modification, are permitted provided that the following conditions are met:
#
# * Redistributions of source code must retain the above copyright notice, this
#   list of conditions and the following disclaimer.
#
# * Redistributions in binary form must reproduce the above copyright notice,
#   this list of conditions and the following disclaimer in the documentation
#   and/or other materials provided with the distribution.
#
# THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
# AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
# IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
# DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
# FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
# DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
# SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
# CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
# OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
# OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
#
# Based on the public domain script from
# https://github.com/eliben/pyelftools/blob/master/examples/dwarf_lineprogram_filenames.py
# originally written by William Woodruff (william@yossarian.net)

from __future__ import print_function

import argparse
import glob
import os
import sys
from collections import defaultdict

from elftools.common.exceptions import ELFError
from elftools.elf.elffile import ELFFile

def create_parser():
    parser = argparse.ArgumentParser(
        description='Tracefiles - get original sources from packaged files')
    parser.add_argument("pkgroot", help="Root dir to packages")
    parser.add_argument("sourcesdir", help="Root dir to original sources")
    parser.add_argument("files", nargs='+', help="Files to parse")

    return parser.parse_args()
    
def process_file(filename, root, pkgroot):
    res = set()
    if os.path.isdir(filename) or not os.access(filename, os.R_OK):
        return res
    try:
        with open(filename, 'rb') as f:
            try:
                elffile = ELFFile(f)
                if not elffile.has_dwarf_info():
                    return res

                dwarfinfo = elffile.get_dwarf_info()
                for CU in dwarfinfo.iter_CUs():
                    # Every compilation unit in the DWARF information may or may not
                    # have a corresponding line program in .debug_line.
                    line_program = dwarfinfo.line_program_for_CU(CU)
                    if line_program is None:
                        continue

                    # Print a reverse mapping of filename -> #entries
                    res.update(line_entry_mapping(line_program))
            except ELFError:
                return find_in_source_root(filename, root, pkgroot)
    except OSError:
        pass
    return res

def find_in_source_root(filename, root, pkgroot):
    for x in [filename.replace(pkgroot, "", 1), filename.replace(pkgroot, "", 1) + ".in"]:
        _clean = x.lstrip("/").split("/")
        while _clean:
            _tmp = glob.glob(os.path.join(root, *_clean))
            _tmp += glob.glob(os.path.join(root, "*", *_clean))
            _tmp += glob.glob(os.path.join(root, "**", *_clean))
            if _tmp:
                return _tmp
            _clean = _clean[1:]
    return []

def line_entry_mapping(line_program):
    res = set()
    filename_map = defaultdict(int)

    # The line program, when decoded, returns a list of line program
    # entries. Each entry contains a state, which we'll use to build
    # a reverse mapping of filename -> #entries.
    lp_entries = line_program.get_entries()
    for lpe in lp_entries:
        # We skip LPEs that don't have an associated file.
        # This can happen if instructions in the compiled binary
        # don't correspond directly to any original source file.
        if not lpe.state or lpe.state.file == 0:
            continue
        filename = lpe_filename(line_program, lpe.state.file)
        filename_map[filename] += 1

    for filename, _ in filename_map.items():
        if not filename.startswith("/"):
            res.add(filename)
    return res

def lpe_filename(line_program, file_index):
    # Retrieving the filename associated with a line program entry
    # involves two levels of indirection: we take the file index from
    # the LPE to grab the file_entry from the line program header,
    # then take the directory index from the file_entry to grab the
    # directory name from the line program header. Finally, we
    # join the (base) filename from the file_entry to the directory
    # name to get the absolute filename.
    lp_header = line_program.header
    file_entries = lp_header["file_entry"]

    # File and directory indices are 1-indexed.
    file_entry = file_entries[file_index - 1]
    dir_index = file_entry["dir_index"]

    # A dir_index of 0 indicates that no absolute directory was recorded during
    # compilation; return just the basename.
    if dir_index == 0:
        return file_entry.name.decode()

    directory = lp_header["include_directory"][dir_index - 1]
    return os.path.join(directory, file_entry.name).decode()


if __name__ == '__main__':
    args = create_parser()
    res = set()
    for filename in args.files:
        res.update(process_file(filename, args.sourcesdir, args.pkgroot))
    print("\n".join([os.path.join(args.sourcesdir, x) for x in sorted(res)]))
