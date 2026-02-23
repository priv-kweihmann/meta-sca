SUMMARY = "Lucet, the Sandboxing WebAssembly Compiler"
HOMEPAGE = "https://github.com/bytecodealliance/lucet"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a1ba2b4c4f909ac0b517d8a37d2ac70f"

SRC_URI = "gitsm://github.com/bytecodealliance/lucet;protocol=https;branch=main"

# nooelint: oelint.vars.srcuridomains
SRC_URI += "\
    crate://crates.io/addr2line/0.16.0 \
    crate://crates.io/addr2line/0.17.0 \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/adler32/1.2.0 \
    crate://crates.io/aho-corasick/0.7.15 \
    crate://crates.io/aho-corasick/0.7.18 \
    crate://crates.io/ambient-authority/0.0.1 \
    crate://crates.io/ansi_term/0.11.0 \
    crate://crates.io/ansi_term/0.12.1 \
    crate://crates.io/anyhow/1.0.35 \
    crate://crates.io/anyhow/1.0.44 \
    crate://crates.io/arbitrary/0.4.7 \
    crate://crates.io/arrayref/0.3.6 \
    crate://crates.io/arrayvec/0.5.2 \
    crate://crates.io/ascii/0.8.7 \
    crate://crates.io/async-trait/0.1.51 \
    crate://crates.io/atty/0.2.11 \
    crate://crates.io/atty/0.2.14 \
    crate://crates.io/autocfg/0.1.2 \
    crate://crates.io/autocfg/0.1.7 \
    crate://crates.io/autocfg/1.0.1 \
    crate://crates.io/backtrace-sys/0.1.28 \
    crate://crates.io/backtrace/0.3.14 \
    crate://crates.io/backtrace/0.3.62 \
    crate://crates.io/base64/0.13.0 \
    crate://crates.io/base64/0.9.3 \
    crate://crates.io/bencher/0.1.5 \
    crate://crates.io/bimap/0.2.0 \
    crate://crates.io/bincode/1.3.3 \
    crate://crates.io/bindgen/0.59.1 \
    crate://crates.io/bitflags/0.7.0 \
    crate://crates.io/bitflags/1.2.1 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/bitvec/0.19.5 \
    crate://crates.io/blake2b_simd/0.5.11 \
    crate://crates.io/blake3/0.3.7 \
    crate://crates.io/block-buffer/0.9.0 \
    crate://crates.io/brotli-sys/0.3.2 \
    crate://crates.io/brotli2/0.3.2 \
    crate://crates.io/bstr/0.2.14 \
    crate://crates.io/bstr/0.2.17 \
    crate://crates.io/buf_redux/0.8.4 \
    crate://crates.io/bumpalo/3.8.0 \
    crate://crates.io/byteorder/1.3.4 \
    crate://crates.io/byteorder/1.4.3 \
    crate://crates.io/bytes/1.1.0 \
    crate://crates.io/cap-fs-ext/0.21.1 \
    crate://crates.io/cap-primitives/0.21.1 \
    crate://crates.io/cap-rand/0.21.1 \
    crate://crates.io/cap-std/0.21.1 \
    crate://crates.io/cap-tempfile/0.21.1 \
    crate://crates.io/cap-time-ext/0.21.1 \
    crate://crates.io/cast/0.2.7 \
    crate://crates.io/cc/1.0.34 \
    crate://crates.io/cc/1.0.66 \
    crate://crates.io/cc/1.0.71 \
    crate://crates.io/cexpr/0.5.0 \
    crate://crates.io/cfg-if/0.1.10 \
    crate://crates.io/cfg-if/0.1.7 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/chrono/0.4.19 \
    crate://crates.io/chunked_transfer/0.3.1 \
    crate://crates.io/cipher/0.2.5 \
    crate://crates.io/cipher/0.3.0 \
    crate://crates.io/clang-sys/1.2.2 \
    crate://crates.io/clap/2.33.3 \
    crate://crates.io/cloudabi/0.0.3 \
    crate://crates.io/cmake/0.1.46 \
    crate://crates.io/colored/1.9.3 \
    crate://crates.io/colored/2.0.0 \
    crate://crates.io/constant_time_eq/0.1.5 \
    crate://crates.io/core_affinity/0.5.9 \
    crate://crates.io/cpp_demangle/0.3.3 \
    crate://crates.io/cpufeatures/0.2.1 \
    crate://crates.io/cranelift-bforest/0.79.0 \
    crate://crates.io/cranelift-codegen-meta/0.79.0 \
    crate://crates.io/cranelift-codegen-shared/0.79.0 \
    crate://crates.io/cranelift-codegen/0.79.0 \
    crate://crates.io/cranelift-entity/0.51.0 \
    crate://crates.io/cranelift-entity/0.79.0 \
    crate://crates.io/cranelift-frontend/0.79.0 \
    crate://crates.io/cranelift-module/0.79.0 \
    crate://crates.io/cranelift-native/0.79.0 \
    crate://crates.io/cranelift-object/0.79.0 \
    crate://crates.io/cranelift-wasm/0.79.0 \
    crate://crates.io/crc32fast/1.2.1 \
    crate://crates.io/criterion-plot/0.4.4 \
    crate://crates.io/criterion/0.3.5 \
    crate://crates.io/crossbeam-channel/0.5.1 \
    crate://crates.io/crossbeam-deque/0.8.1 \
    crate://crates.io/crossbeam-epoch/0.9.5 \
    crate://crates.io/crossbeam-utils/0.8.1 \
    crate://crates.io/crossbeam-utils/0.8.5 \
    crate://crates.io/crossterm/0.19.0 \
    crate://crates.io/crossterm_winapi/0.7.0 \
    crate://crates.io/crypto-mac/0.10.1 \
    crate://crates.io/crypto-mac/0.11.1 \
    crate://crates.io/crypto-mac/0.8.0 \
    crate://crates.io/csv-core/0.1.10 \
    crate://crates.io/csv/1.1.5 \
    crate://crates.io/csv/1.1.6 \
    crate://crates.io/deflate/0.7.20 \
    crate://crates.io/derivative/1.0.4 \
    crate://crates.io/derive_arbitrary/0.4.7 \
    crate://crates.io/digest/0.9.0 \
    crate://crates.io/dirs-next/2.0.0 \
    crate://crates.io/dirs-sys-next/0.1.2 \
    crate://crates.io/dirs/1.0.5 \
    crate://crates.io/either/1.6.1 \
    crate://crates.io/elfkit/0.0.4 \
    crate://crates.io/enum-primitive-derive/0.1.2 \
    crate://crates.io/env_logger/0.6.2 \
    crate://crates.io/env_logger/0.7.1 \
    crate://crates.io/env_logger/0.8.4 \
    crate://crates.io/errno-dragonfly/0.1.1 \
    crate://crates.io/errno-dragonfly/0.1.2 \
    crate://crates.io/errno/0.2.4 \
    crate://crates.io/errno/0.2.8 \
    crate://crates.io/error-chain/0.11.0 \
    crate://crates.io/failure/0.1.8 \
    crate://crates.io/failure_derive/0.1.8 \
    crate://crates.io/fallible-iterator/0.2.0 \
    crate://crates.io/filetime/0.2.13 \
    crate://crates.io/fixedbitset/0.1.9 \
    crate://crates.io/flate2/1.0.22 \
    crate://crates.io/fs-set-times/0.13.1 \
    crate://crates.io/fuchsia-cprng/0.1.1 \
    crate://crates.io/funty/1.1.0 \
    crate://crates.io/futures-core/0.3.17 \
    crate://crates.io/futures-executor/0.3.17 \
    crate://crates.io/futures-task/0.3.17 \
    crate://crates.io/futures-util/0.3.17 \
    crate://crates.io/gcc/0.3.55 \
    crate://crates.io/generic-array/0.14.4 \
    crate://crates.io/getrandom/0.1.15 \
    crate://crates.io/getrandom/0.1.16 \
    crate://crates.io/getrandom/0.2.3 \
    crate://crates.io/gimli/0.25.0 \
    crate://crates.io/gimli/0.26.1 \
    crate://crates.io/glob/0.2.11 \
    crate://crates.io/glob/0.3.0 \
    crate://crates.io/goblin/0.0.20 \
    crate://crates.io/goblin/0.0.21 \
    crate://crates.io/goblin/0.0.24 \
    crate://crates.io/goblin/0.4.3 \
    crate://crates.io/gzip-header/0.3.0 \
    crate://crates.io/half/1.8.2 \
    crate://crates.io/hashbrown/0.11.2 \
    crate://crates.io/heck/0.3.1 \
    crate://crates.io/heck/0.3.3 \
    crate://crates.io/hermit-abi/0.1.19 \
    crate://crates.io/hmac/0.10.1 \
    crate://crates.io/hmac/0.11.0 \
    crate://crates.io/httparse/1.3.4 \
    crate://crates.io/human-size/0.4.1 \
    crate://crates.io/humantime/1.3.0 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/hwloc/0.5.0 \
    crate://crates.io/idna/0.1.5 \
    crate://crates.io/indexmap/1.7.0 \
    crate://crates.io/instant/0.1.12 \
    crate://crates.io/io-extras/0.11.2 \
    crate://crates.io/io-lifetimes/0.3.3 \
    crate://crates.io/ipnet/2.3.1 \
    crate://crates.io/itertools/0.10.1 \
    crate://crates.io/itertools/0.6.5 \
    crate://crates.io/itoa/0.4.3 \
    crate://crates.io/itoa/0.4.8 \
    crate://crates.io/js-sys/0.3.55 \
    crate://crates.io/kernel32-sys/0.2.2 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/lazycell/1.3.0 \
    crate://crates.io/leb128/0.2.4 \
    crate://crates.io/leb128/0.2.5 \
    crate://crates.io/libc/0.2.105 \
    crate://crates.io/libc/0.2.81 \
    crate://crates.io/libfuzzer-sys/0.3.5 \
    crate://crates.io/libloading/0.5.0 \
    crate://crates.io/libloading/0.6.6 \
    crate://crates.io/libloading/0.6.7 \
    crate://crates.io/libloading/0.7.1 \
    crate://crates.io/libproc/0.9.1 \
    crate://crates.io/linux-raw-sys/0.0.36 \
    crate://crates.io/lock_api/0.4.5 \
    crate://crates.io/log/0.3.9 \
    crate://crates.io/log/0.4.11 \
    crate://crates.io/log/0.4.14 \
    crate://crates.io/lucet-module/0.5.1 \
    crate://crates.io/mach/0.3.2 \
    crate://crates.io/matchers/0.1.0 \
    crate://crates.io/matches/0.1.8 \
    crate://crates.io/maybe-owned/0.3.4 \
    crate://crates.io/memchr/2.3.4 \
    crate://crates.io/memchr/2.4.1 \
    crate://crates.io/memoffset/0.5.6 \
    crate://crates.io/memoffset/0.6.4 \
    crate://crates.io/mime/0.2.6 \
    crate://crates.io/mime_guess/1.8.8 \
    crate://crates.io/minisign/0.5.23 \
    crate://crates.io/minisign/0.7.0 \
    crate://crates.io/miniz_oxide/0.4.4 \
    crate://crates.io/mio/0.7.14 \
    crate://crates.io/miow/0.3.7 \
    crate://crates.io/more-asserts/0.2.1 \
    crate://crates.io/multipart/0.15.4 \
    crate://crates.io/mvdb/0.3.0 \
    crate://crates.io/nix/0.12.1 \
    crate://crates.io/nix/0.23.0 \
    crate://crates.io/nom/6.1.2 \
    crate://crates.io/ntapi/0.3.6 \
    crate://crates.io/num-derive/0.3.3 \
    crate://crates.io/num-integer/0.1.39 \
    crate://crates.io/num-iter/0.1.37 \
    crate://crates.io/num-traits/0.1.43 \
    crate://crates.io/num-traits/0.2.14 \
    crate://crates.io/num-traits/0.2.6 \
    crate://crates.io/num/0.1.42 \
    crate://crates.io/num_cpus/1.10.0 \
    crate://crates.io/num_cpus/1.13.0 \
    crate://crates.io/numtoa/0.1.0 \
    crate://crates.io/object/0.14.1 \
    crate://crates.io/object/0.21.1 \
    crate://crates.io/object/0.22.0 \
    crate://crates.io/object/0.27.1 \
    crate://crates.io/once_cell/1.8.0 \
    crate://crates.io/oorandom/11.1.3 \
    crate://crates.io/opaque-debug/0.3.0 \
    crate://crates.io/ordermap/0.3.5 \
    crate://crates.io/parity-wasm/0.40.3 \
    crate://crates.io/parking_lot/0.11.2 \
    crate://crates.io/parking_lot_core/0.8.5 \
    crate://crates.io/paste/1.0.5 \
    crate://crates.io/pbkdf2/0.6.0 \
    crate://crates.io/pbkdf2/0.9.0 \
    crate://crates.io/peeking_take_while/0.1.2 \
    crate://crates.io/percent-encoding/1.0.1 \
    crate://crates.io/perf-event-open-sys/1.0.1 \
    crate://crates.io/perf-event/0.4.6 \
    crate://crates.io/petgraph/0.4.13 \
    crate://crates.io/phf/0.7.24 \
    crate://crates.io/phf_codegen/0.7.24 \
    crate://crates.io/phf_generator/0.7.24 \
    crate://crates.io/phf_shared/0.7.24 \
    crate://crates.io/pin-project-lite/0.2.7 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.14 \
    crate://crates.io/plain/0.2.3 \
    crate://crates.io/plotters-backend/0.3.2 \
    crate://crates.io/plotters-svg/0.3.1 \
    crate://crates.io/plotters/0.3.1 \
    crate://crates.io/ppv-lite86/0.2.10 \
    crate://crates.io/ppv-lite86/0.2.15 \
    crate://crates.io/precision/0.1.11 \
    crate://crates.io/pretty_env_logger/0.4.0 \
    crate://crates.io/printtable/0.1.0 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro2/0.4.27 \
    crate://crates.io/proc-macro2/0.4.30 \
    crate://crates.io/proc-macro2/1.0.24 \
    crate://crates.io/proc-macro2/1.0.32 \
    crate://crates.io/proc-maps/0.1.8 \
    crate://crates.io/progress/0.2.0 \
    crate://crates.io/psm/0.1.16 \
    crate://crates.io/quick-error/1.2.3 \
    crate://crates.io/quote/0.3.15 \
    crate://crates.io/quote/0.6.11 \
    crate://crates.io/quote/0.6.13 \
    crate://crates.io/quote/1.0.10 \
    crate://crates.io/quote/1.0.7 \
    crate://crates.io/radium/0.5.3 \
    crate://crates.io/rand/0.4.6 \
    crate://crates.io/rand/0.5.6 \
    crate://crates.io/rand/0.6.5 \
    crate://crates.io/rand/0.7.3 \
    crate://crates.io/rand/0.8.4 \
    crate://crates.io/rand_chacha/0.1.1 \
    crate://crates.io/rand_chacha/0.2.2 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.3.1 \
    crate://crates.io/rand_core/0.4.2 \
    crate://crates.io/rand_core/0.5.1 \
    crate://crates.io/rand_core/0.6.3 \
    crate://crates.io/rand_hc/0.1.0 \
    crate://crates.io/rand_hc/0.2.0 \
    crate://crates.io/rand_hc/0.3.1 \
    crate://crates.io/rand_isaac/0.1.1 \
    crate://crates.io/rand_jitter/0.1.4 \
    crate://crates.io/rand_os/0.1.3 \
    crate://crates.io/rand_pcg/0.1.2 \
    crate://crates.io/rand_pcg/0.2.1 \
    crate://crates.io/rand_xorshift/0.1.1 \
    crate://crates.io/raw-cpuid/9.1.1 \
    crate://crates.io/rayon-core/1.9.1 \
    crate://crates.io/rayon/1.5.1 \
    crate://crates.io/rdrand/0.4.0 \
    crate://crates.io/redox_syscall/0.1.52 \
    crate://crates.io/redox_syscall/0.2.10 \
    crate://crates.io/redox_termios/0.1.1 \
    crate://crates.io/redox_termios/0.1.2 \
    crate://crates.io/redox_users/0.3.5 \
    crate://crates.io/redox_users/0.4.0 \
    crate://crates.io/regalloc/0.0.33 \
    crate://crates.io/regex-automata/0.1.10 \
    crate://crates.io/regex-automata/0.1.9 \
    crate://crates.io/regex-syntax/0.6.21 \
    crate://crates.io/regex-syntax/0.6.25 \
    crate://crates.io/regex/1.4.2 \
    crate://crates.io/regex/1.5.4 \
    crate://crates.io/region/2.2.0 \
    crate://crates.io/remove_dir_all/0.5.3 \
    crate://crates.io/rouille/3.0.0 \
    crate://crates.io/rpassword/5.0.1 \
    crate://crates.io/rust-argon2/0.8.3 \
    crate://crates.io/rustc-demangle/0.1.13 \
    crate://crates.io/rustc-demangle/0.1.21 \
    crate://crates.io/rustc-hash/1.1.0 \
    crate://crates.io/rustc_version/0.2.3 \
    crate://crates.io/rustc_version/0.4.0 \
    crate://crates.io/rustix/0.26.2 \
    crate://crates.io/ryu/1.0.5 \
    crate://crates.io/safemem/0.3.3 \
    crate://crates.io/salsa20/0.7.2 \
    crate://crates.io/salsa20/0.8.1 \
    crate://crates.io/same-file/1.0.6 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/scroll/0.10.2 \
    crate://crates.io/scroll/0.9.2 \
    crate://crates.io/scroll_derive/0.10.5 \
    crate://crates.io/scroll_derive/0.9.5 \
    crate://crates.io/scrypt/0.5.0 \
    crate://crates.io/scrypt/0.8.0 \
    crate://crates.io/semver-parser/0.7.0 \
    crate://crates.io/semver/0.9.0 \
    crate://crates.io/semver/1.0.4 \
    crate://crates.io/serde-big-array/0.2.0 \
    crate://crates.io/serde/1.0.118 \
    crate://crates.io/serde/1.0.130 \
    crate://crates.io/serde_cbor/0.11.2 \
    crate://crates.io/serde_derive/1.0.118 \
    crate://crates.io/serde_derive/1.0.130 \
    crate://crates.io/serde_json/1.0.60 \
    crate://crates.io/serde_json/1.0.68 \
    crate://crates.io/sha1/0.6.0 \
    crate://crates.io/sha2/0.9.8 \
    crate://crates.io/sharded-slab/0.1.4 \
    crate://crates.io/shellexpand/2.1.0 \
    crate://crates.io/shlex/1.1.0 \
    crate://crates.io/signal-hook-registry/1.4.0 \
    crate://crates.io/signal-hook/0.1.17 \
    crate://crates.io/siphasher/0.2.3 \
    crate://crates.io/siphasher/0.3.7 \
    crate://crates.io/slab/0.4.5 \
    crate://crates.io/smallvec/1.7.0 \
    crate://crates.io/stable_deref_trait/1.2.0 \
    crate://crates.io/strsim/0.8.0 \
    crate://crates.io/structopt-derive/0.4.14 \
    crate://crates.io/structopt-derive/0.4.18 \
    crate://crates.io/structopt/0.3.21 \
    crate://crates.io/structopt/0.3.25 \
    crate://crates.io/subtle/2.3.0 \
    crate://crates.io/subtle/2.4.1 \
    crate://crates.io/syn/0.11.11 \
    crate://crates.io/syn/0.15.30 \
    crate://crates.io/syn/0.15.44 \
    crate://crates.io/syn/1.0.54 \
    crate://crates.io/syn/1.0.81 \
    crate://crates.io/synom/0.11.3 \
    crate://crates.io/synstructure/0.12.6 \
    crate://crates.io/system-interface/0.16.0 \
    crate://crates.io/tap/1.0.1 \
    crate://crates.io/target-lexicon/0.11.2 \
    crate://crates.io/target-lexicon/0.12.2 \
    crate://crates.io/target-lexicon/0.8.1 \
    crate://crates.io/task-group/0.2.1 \
    crate://crates.io/tempdir/0.3.7 \
    crate://crates.io/tempfile/3.2.0 \
    crate://crates.io/term/0.5.2 \
    crate://crates.io/termcolor/1.1.2 \
    crate://crates.io/terminal_size/0.1.17 \
    crate://crates.io/termion/1.5.1 \
    crate://crates.io/termion/1.5.6 \
    crate://crates.io/termios/0.2.2 \
    crate://crates.io/textwrap/0.11.0 \
    crate://crates.io/thiserror-impl/1.0.22 \
    crate://crates.io/thiserror-impl/1.0.30 \
    crate://crates.io/thiserror/1.0.22 \
    crate://crates.io/thiserror/1.0.30 \
    crate://crates.io/thread_local/1.0.1 \
    crate://crates.io/thread_local/1.1.3 \
    crate://crates.io/threadpool/1.7.1 \
    crate://crates.io/time/0.1.44 \
    crate://crates.io/tiny_http/0.6.2 \
    crate://crates.io/tinytemplate/1.2.1 \
    crate://crates.io/tinyvec/1.1.0 \
    crate://crates.io/tinyvec_macros/0.1.0 \
    crate://crates.io/tokio-macros/1.6.0 \
    crate://crates.io/tokio/1.14.0 \
    crate://crates.io/toml/0.5.0 \
    crate://crates.io/tracing-attributes/0.1.18 \
    crate://crates.io/tracing-core/0.1.21 \
    crate://crates.io/tracing-log/0.1.2 \
    crate://crates.io/tracing-subscriber/0.3.1 \
    crate://crates.io/tracing/0.1.29 \
    crate://crates.io/twoway/0.1.8 \
    crate://crates.io/typenum/1.12.0 \
    crate://crates.io/typenum/1.14.0 \
    crate://crates.io/unicase/1.4.2 \
    crate://crates.io/unicode-bidi/0.3.4 \
    crate://crates.io/unicode-normalization/0.1.16 \
    crate://crates.io/unicode-segmentation/1.7.1 \
    crate://crates.io/unicode-segmentation/1.8.0 \
    crate://crates.io/unicode-width/0.1.5 \
    crate://crates.io/unicode-width/0.1.9 \
    crate://crates.io/unicode-xid/0.0.4 \
    crate://crates.io/unicode-xid/0.1.0 \
    crate://crates.io/unicode-xid/0.2.1 \
    crate://crates.io/unicode-xid/0.2.2 \
    crate://crates.io/url/1.7.2 \
    crate://crates.io/userfaultfd-sys/0.4.0 \
    crate://crates.io/userfaultfd/0.4.2 \
    crate://crates.io/uuid/0.7.4 \
    crate://crates.io/uuid/0.8.2 \
    crate://crates.io/vec_map/0.8.1 \
    crate://crates.io/vec_map/0.8.2 \
    crate://crates.io/veriwasm/0.1.4 \
    crate://crates.io/version_check/0.1.5 \
    crate://crates.io/version_check/0.9.2 \
    crate://crates.io/version_check/0.9.3 \
    crate://crates.io/void/1.0.2 \
    crate://crates.io/wabt-sys/0.8.0 \
    crate://crates.io/wabt/0.10.0 \
    crate://crates.io/wait-timeout/0.2.0 \
    crate://crates.io/walkdir/2.3.2 \
    crate://crates.io/wasi-cap-std-sync/0.32.0 \
    crate://crates.io/wasi-common/0.32.0 \
    crate://crates.io/wasi-tokio/0.32.0 \
    crate://crates.io/wasi/0.10.0+wasi-snapshot-preview1 \
    crate://crates.io/wasi/0.10.2+wasi-snapshot-preview1 \
    crate://crates.io/wasi/0.9.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.78 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.78 \
    crate://crates.io/wasm-bindgen-macro/0.2.78 \
    crate://crates.io/wasm-bindgen-shared/0.2.78 \
    crate://crates.io/wasm-bindgen/0.2.78 \
    crate://crates.io/wasm-encoder/0.4.1 \
    crate://crates.io/wasm-smith/0.3.2 \
    crate://crates.io/wasmparser/0.57.0 \
    crate://crates.io/wasmparser/0.59.0 \
    crate://crates.io/wasmparser/0.67.0 \
    crate://crates.io/wasmparser/0.69.2 \
    crate://crates.io/wasmparser/0.81.0 \
    crate://crates.io/wasmprinter/0.2.16 \
    crate://crates.io/wasmtime-environ/0.32.0 \
    crate://crates.io/wasmtime-jit/0.32.0 \
    crate://crates.io/wasmtime-runtime/0.32.0 \
    crate://crates.io/wasmtime-types/0.32.0 \
    crate://crates.io/wasmtime/0.32.0 \
    crate://crates.io/wast/28.0.0 \
    crate://crates.io/wast/35.0.2 \
    crate://crates.io/wat/1.0.29 \
    crate://crates.io/web-sys/0.3.55 \
    crate://crates.io/wiggle-generate/0.32.0 \
    crate://crates.io/wiggle-macro/0.32.0 \
    crate://crates.io/wiggle/0.32.0 \
    crate://crates.io/winapi-build/0.1.1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.2.8 \
    crate://crates.io/winapi/0.3.7 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/winx/0.29.2 \
    crate://crates.io/witx/0.9.1 \
    crate://crates.io/wyz/0.2.0 \
    crate://crates.io/yaxpeax-arch/0.2.7 \
    crate://crates.io/yaxpeax-arm/0.1.3 \
    crate://crates.io/yaxpeax-core/0.0.4-vw-tweaks \
    crate://crates.io/yaxpeax-msp430/0.1.1 \
    crate://crates.io/yaxpeax-pic17/0.1.1 \
    crate://crates.io/yaxpeax-pic18/0.1.1 \
    crate://crates.io/yaxpeax-x86/1.1.1 \
"

SRC_URI[addr2line-0.16.0.sha256sum] = "3e61f2b7f93d2c7d2b08263acaa4a363b3e276806c68af6134c44f523bf1aacd"
SRC_URI[addr2line-0.17.0.sha256sum] = "b9ecd88a8c8378ca913a680cd98f0f13ac67383d35993f86c90a70e3f137816b"
SRC_URI[adler-1.0.2.sha256sum] = "f26201604c87b1e01bd3d98f8d5d9a8fcbb815e8cedb41ffccbeb4bf593a35fe"
SRC_URI[adler32-1.2.0.sha256sum] = "aae1277d39aeec15cb388266ecc24b11c80469deae6067e17a1a7aa9e5c1f234"
SRC_URI[aho-corasick-0.7.15.sha256sum] = "7404febffaa47dac81aa44dba71523c9d069b1bdc50a77db41195149e17f68e5"
SRC_URI[aho-corasick-0.7.18.sha256sum] = "1e37cfd5e7657ada45f742d6e99ca5788580b5c529dc78faf11ece6dc702656f"
SRC_URI[ambient-authority-0.0.1.sha256sum] = "ec8ad6edb4840b78c5c3d88de606b22252d552b55f3a4699fbb10fc070ec3049"
SRC_URI[ansi_term-0.11.0.sha256sum] = "ee49baf6cb617b853aa8d93bf420db2383fab46d314482ca2803b40d5fde979b"
SRC_URI[ansi_term-0.12.1.sha256sum] = "d52a9bb7ec0cf484c551830a7ce27bd20d67eac647e1befb56b0be4ee39a55d2"
SRC_URI[anyhow-1.0.35.sha256sum] = "2c0df63cb2955042487fad3aefd2c6e3ae7389ac5dc1beb28921de0b69f779d4"
SRC_URI[anyhow-1.0.44.sha256sum] = "61604a8f862e1d5c3229fdd78f8b02c68dcf73a4c4b05fd636d12240aaa242c1"
SRC_URI[arbitrary-0.4.7.sha256sum] = "db55d72333851e17d572bec876e390cd3b11eb1ef53ae821dd9f3b653d2b4569"
SRC_URI[arrayref-0.3.6.sha256sum] = "a4c527152e37cf757a3f78aae5a06fbeefdb07ccc535c980a3208ee3060dd544"
SRC_URI[arrayvec-0.5.2.sha256sum] = "23b62fc65de8e4e7f52534fb52b0f3ed04746ae267519eef2a83941e8085068b"
SRC_URI[ascii-0.8.7.sha256sum] = "97be891acc47ca214468e09425d02cef3af2c94d0d82081cd02061f996802f14"
SRC_URI[async-trait-0.1.51.sha256sum] = "44318e776df68115a881de9a8fd1b9e53368d7a4a5ce4cc48517da3393233a5e"
SRC_URI[atty-0.2.11.sha256sum] = "9a7d5b8723950951411ee34d271d99dddcc2035a16ab25310ea2c8cfd4369652"
SRC_URI[atty-0.2.14.sha256sum] = "d9b39be18770d11421cdb1b9947a45dd3f37e93092cbf377614828a319d5fee8"
SRC_URI[autocfg-0.1.2.sha256sum] = "a6d640bee2da49f60a4068a7fae53acde8982514ab7bae8b8cea9e88cbcfd799"
SRC_URI[autocfg-0.1.7.sha256sum] = "1d49d90015b3c36167a20fe2810c5cd875ad504b39cff3d4eae7977e6b7c1cb2"
SRC_URI[autocfg-1.0.1.sha256sum] = "cdb031dd78e28731d87d56cc8ffef4a8f36ca26c38fe2de700543e627f8a464a"
SRC_URI[backtrace-0.3.14.sha256sum] = "cd5a90e2b463010cd0e0ce9a11d4a9d5d58d9f41d4a6ba3dcaf9e68b466e88b4"
SRC_URI[backtrace-0.3.62.sha256sum] = "091bcdf2da9950f96aa522681ce805e6857f6ca8df73833d35736ab2dc78e152"
SRC_URI[backtrace-sys-0.1.28.sha256sum] = "797c830ac25ccc92a7f8a7b9862bde440715531514594a6154e3d4a54dd769b6"
SRC_URI[base64-0.13.0.sha256sum] = "904dfeac50f3cdaba28fc6f57fdcddb75f49ed61346676a78c4ffe55877802fd"
SRC_URI[base64-0.9.3.sha256sum] = "489d6c0ed21b11d038c31b6ceccca973e65d73ba3bd8ecb9a2babf5546164643"
SRC_URI[bencher-0.1.5.sha256sum] = "7dfdb4953a096c551ce9ace855a604d702e6e62d77fac690575ae347571717f5"
SRC_URI[bimap-0.2.0.sha256sum] = "505e45beaf0a1462f5548fe885edf2d83e62022b2ce8b10fef0f7686b48c9266"
SRC_URI[bincode-1.3.3.sha256sum] = "b1f45e9417d87227c7a56d22e471c6206462cba514c7590c09aff4cf6d1ddcad"
SRC_URI[bindgen-0.59.1.sha256sum] = "453c49e5950bb0eb63bb3df640e31618846c89d5b7faa54040d76e98e0134375"
SRC_URI[bitflags-0.7.0.sha256sum] = "aad18937a628ec6abcd26d1489012cc0e18c21798210f491af69ded9b881106d"
SRC_URI[bitflags-1.2.1.sha256sum] = "cf1de2fe8c75bc145a2f577add951f8134889b4795d47466a54a5c846d691693"
SRC_URI[bitflags-1.3.2.sha256sum] = "bef38d45163c2f1dde094a7dfd33ccf595c92905c8f8f4fdc18d06fb1037718a"
SRC_URI[bitvec-0.19.5.sha256sum] = "8942c8d352ae1838c9dda0b0ca2ab657696ef2232a20147cf1b30ae1a9cb4321"
SRC_URI[blake2b_simd-0.5.11.sha256sum] = "afa748e348ad3be8263be728124b24a24f268266f6f5d58af9d75f6a40b5c587"
SRC_URI[blake3-0.3.7.sha256sum] = "e9ff35b701f3914bdb8fad3368d822c766ef2858b2583198e41639b936f09d3f"
SRC_URI[block-buffer-0.9.0.sha256sum] = "4152116fd6e9dadb291ae18fc1ec3575ed6d84c29642d97890f4b4a3417297e4"
SRC_URI[brotli-sys-0.3.2.sha256sum] = "4445dea95f4c2b41cde57cc9fee236ae4dbae88d8fcbdb4750fc1bb5d86aaecd"
SRC_URI[brotli2-0.3.2.sha256sum] = "0cb036c3eade309815c15ddbacec5b22c4d1f3983a774ab2eac2e3e9ea85568e"
SRC_URI[bstr-0.2.14.sha256sum] = "473fc6b38233f9af7baa94fb5852dca389e3d95b8e21c8e3719301462c5d9faf"
SRC_URI[bstr-0.2.17.sha256sum] = "ba3569f383e8f1598449f1a423e72e99569137b47740b1da11ef19af3d5c3223"
SRC_URI[buf_redux-0.8.4.sha256sum] = "b953a6887648bb07a535631f2bc00fbdb2a2216f135552cb3f534ed136b9c07f"
SRC_URI[bumpalo-3.8.0.sha256sum] = "8f1e260c3a9040a7c19a12468758f4c16f31a81a1fe087482be9570ec864bb6c"
SRC_URI[byteorder-1.3.4.sha256sum] = "08c48aae112d48ed9f069b33538ea9e3e90aa263cfa3d1c24309612b1f7472de"
SRC_URI[byteorder-1.4.3.sha256sum] = "14c189c53d098945499cdfa7ecc63567cf3886b3332b312a5b4585d8d3a6a610"
SRC_URI[bytes-1.1.0.sha256sum] = "c4872d67bab6358e59559027aa3b9157c53d9358c51423c17554809a8858e0f8"
SRC_URI[cap-fs-ext-0.21.1.sha256sum] = "4f8499797f7e264c83334d9fc98b2c9889ebe5839514a14d81769ca09d71fd1d"
SRC_URI[cap-primitives-0.21.1.sha256sum] = "c5998b8b3a49736500aec3c123fa3f6f605a125b41a6df725e6b7c924a612ab4"
SRC_URI[cap-rand-0.21.1.sha256sum] = "fafda903eb4a85903b106439cf62524275f3ae0609bb9e1ae9da7e7c26d4150c"
SRC_URI[cap-std-0.21.1.sha256sum] = "811de89a7ede4ba32f2b75fe5c668a534da24942d81c081248a9d2843ebd517d"
SRC_URI[cap-tempfile-0.21.1.sha256sum] = "a4fa925a69a454293146bc04dfcbeba993093b1816531f9408e229130d7fc465"
SRC_URI[cap-time-ext-0.21.1.sha256sum] = "85f263d62447efe8829efdf947bbb4824ba2a3e2852b3be1d62f76fc05c326b0"
SRC_URI[cast-0.2.7.sha256sum] = "4c24dab4283a142afa2fdca129b80ad2c6284e073930f964c3a1293c225ee39a"
SRC_URI[cc-1.0.34.sha256sum] = "30f813bf45048a18eda9190fd3c6b78644146056740c43172a5a3699118588fd"
SRC_URI[cc-1.0.66.sha256sum] = "4c0496836a84f8d0495758516b8621a622beb77c0fed418570e50764093ced48"
SRC_URI[cc-1.0.71.sha256sum] = "79c2681d6594606957bbb8631c4b90a7fcaaa72cdb714743a437b156d6a7eedd"
SRC_URI[cexpr-0.5.0.sha256sum] = "db507a7679252d2276ed0dd8113c6875ec56d3089f9225b2b42c30cc1f8e5c89"
SRC_URI[cfg-if-0.1.10.sha256sum] = "4785bdd1c96b2a846b2bd7cc02e86b6b3dbf14e7e53446c4f54c92a361040822"
SRC_URI[cfg-if-0.1.7.sha256sum] = "11d43355396e872eefb45ce6342e4374ed7bc2b3a502d1b28e36d6e23c05d1f4"
SRC_URI[cfg-if-1.0.0.sha256sum] = "baf1de4339761588bc0619e3cbc0120ee582ebb74b53b4efbf79117bd2da40fd"
SRC_URI[chrono-0.4.19.sha256sum] = "670ad68c9088c2a963aaa298cb369688cf3f9465ce5e2d4ca10e6e0098a1ce73"
SRC_URI[chunked_transfer-0.3.1.sha256sum] = "498d20a7aaf62625b9bf26e637cf7736417cde1d0c99f1d04d1170229a85cf87"
SRC_URI[cipher-0.2.5.sha256sum] = "12f8e7987cbd042a63249497f41aed09f8e65add917ea6566effbc56578d6801"
SRC_URI[cipher-0.3.0.sha256sum] = "7ee52072ec15386f770805afd189a01c8841be8696bed250fa2f13c4c0d6dfb7"
SRC_URI[clang-sys-1.2.2.sha256sum] = "10612c0ec0e0a1ff0e97980647cb058a6e7aedb913d01d009c406b8b7d0b26ee"
SRC_URI[clap-2.33.3.sha256sum] = "37e58ac78573c40708d45522f0d80fa2f01cc4f9b4e2bf749807255454312002"
SRC_URI[cloudabi-0.0.3.sha256sum] = "ddfc5b9aa5d4507acaf872de71051dfd0e309860e88966e1051e462a077aac4f"
SRC_URI[cmake-0.1.46.sha256sum] = "b7b858541263efe664aead4a5209a4ae5c5d2811167d4ed4ee0944503f8d2089"
SRC_URI[colored-1.9.3.sha256sum] = "f4ffc801dacf156c5854b9df4f425a626539c3a6ef7893cc0c5084a23f0b6c59"
SRC_URI[colored-2.0.0.sha256sum] = "b3616f750b84d8f0de8a58bda93e08e2a81ad3f523089b05f1dffecab48c6cbd"
SRC_URI[constant_time_eq-0.1.5.sha256sum] = "245097e9a4535ee1e3e3931fcfcd55a796a44c643e8596ff6566d68f09b87bbc"
SRC_URI[core_affinity-0.5.9.sha256sum] = "6d162c6e463c31dbf78fefa99d042156c1c74d404e299cfe3df2923cb857595b"
SRC_URI[cpp_demangle-0.3.3.sha256sum] = "8ea47428dc9d2237f3c6bc134472edfd63ebba0af932e783506dcfd66f10d18a"
SRC_URI[cpufeatures-0.2.1.sha256sum] = "95059428f66df56b63431fdb4e1947ed2190586af5c5a8a8b71122bdf5a7f469"
SRC_URI[cranelift-bforest-0.79.0.sha256sum] = "f0fb5e025141af5b9cbfff4351dc393596d017725f126c954bf472ce78dbba6b"
SRC_URI[cranelift-codegen-0.79.0.sha256sum] = "a278c67cc48d0e8ff2275fb6fc31527def4be8f3d81640ecc8cd005a3aa45ded"
SRC_URI[cranelift-codegen-meta-0.79.0.sha256sum] = "28274c1916c931c5603d94c5479d2ddacaaa574d298814ac1c99964ce92cbe85"
SRC_URI[cranelift-codegen-shared-0.79.0.sha256sum] = "5411cf49ab440b749d4da5129dfc45caf6e5fb7b2742b1fe1a421964fda2ee88"
SRC_URI[cranelift-entity-0.51.0.sha256sum] = "057e78f3dba2f41e2ff2723cce197b18f5ffa603fb67fbabf57aca8d2b55cb95"
SRC_URI[cranelift-entity-0.79.0.sha256sum] = "64dde596f98462a37b029d81c8567c23cc68b8356b017f12945c545ac0a83203"
SRC_URI[cranelift-frontend-0.79.0.sha256sum] = "544605d400710bd9c89924050b30c2e0222a387a5a8b5f04da9a9fdcbd8656a5"
SRC_URI[cranelift-module-0.79.0.sha256sum] = "decb7d353b972b60c617ea5b4d09b9574ffc61daef7cd534c060ca728dadc10c"
SRC_URI[cranelift-native-0.79.0.sha256sum] = "b7f8839befb64f7a39cb855241ae2c8eb74cea27c97fff2a007075fdb8a7f7d4"
SRC_URI[cranelift-object-0.79.0.sha256sum] = "9fe4d91d7e85ad84e3e1b9cf0bba1bb117d35de867e72e4740cb7423d5351792"
SRC_URI[cranelift-wasm-0.79.0.sha256sum] = "80c9e14062c6a1cd2367dd30ea8945976639d5fe2062da8bdd40ada9ce3cb82e"
SRC_URI[crc32fast-1.2.1.sha256sum] = "81156fece84ab6a9f2afdb109ce3ae577e42b1228441eded99bd77f627953b1a"
SRC_URI[criterion-0.3.5.sha256sum] = "1604dafd25fba2fe2d5895a9da139f8dc9b319a5fe5354ca137cbbce4e178d10"
SRC_URI[criterion-plot-0.4.4.sha256sum] = "d00996de9f2f7559f7f4dc286073197f83e92256a59ed395f9aac01fe717da57"
SRC_URI[crossbeam-channel-0.5.1.sha256sum] = "06ed27e177f16d65f0f0c22a213e17c696ace5dd64b14258b52f9417ccb52db4"
SRC_URI[crossbeam-deque-0.8.1.sha256sum] = "6455c0ca19f0d2fbf751b908d5c55c1f5cbc65e03c4225427254b46890bdde1e"
SRC_URI[crossbeam-epoch-0.9.5.sha256sum] = "4ec02e091aa634e2c3ada4a392989e7c3116673ef0ac5b72232439094d73b7fd"
SRC_URI[crossbeam-utils-0.8.1.sha256sum] = "02d96d1e189ef58269ebe5b97953da3274d83a93af647c2ddd6f9dab28cedb8d"
SRC_URI[crossbeam-utils-0.8.5.sha256sum] = "d82cfc11ce7f2c3faef78d8a684447b40d503d9681acebed6cb728d45940c4db"
SRC_URI[crossterm-0.19.0.sha256sum] = "7c36c10130df424b2f3552fcc2ddcd9b28a27b1e54b358b45874f88d1ca6888c"
SRC_URI[crossterm_winapi-0.7.0.sha256sum] = "0da8964ace4d3e4a044fd027919b2237000b24315a37c916f61809f1ff2140b9"
SRC_URI[crypto-mac-0.10.1.sha256sum] = "bff07008ec701e8028e2ceb8f83f0e4274ee62bd2dbdc4fefff2e9a91824081a"
SRC_URI[crypto-mac-0.11.1.sha256sum] = "b1d1a86f49236c215f271d40892d5fc950490551400b02ef360692c29815c714"
SRC_URI[crypto-mac-0.8.0.sha256sum] = "b584a330336237c1eecd3e94266efb216c56ed91225d634cb2991c5f3fd1aeab"
SRC_URI[csv-1.1.5.sha256sum] = "f9d58633299b24b515ac72a3f869f8b91306a3cec616a602843a383acd6f9e97"
SRC_URI[csv-1.1.6.sha256sum] = "22813a6dc45b335f9bade10bf7271dc477e81113e89eb251a0bc2a8a81c536e1"
SRC_URI[csv-core-0.1.10.sha256sum] = "2b2466559f260f48ad25fe6317b3c8dac77b5bdb5763ac7d9d6103530663bc90"
SRC_URI[deflate-0.7.20.sha256sum] = "707b6a7b384888a70c8d2e8650b3e60170dfc6a67bb4aa67b6dfca57af4bedb4"
SRC_URI[derivative-1.0.4.sha256sum] = "3c6d883546668a3e2011b6a716a7330b82eabb0151b138217f632c8243e17135"
SRC_URI[derive_arbitrary-0.4.7.sha256sum] = "b1a012b5e473dc912f0db0546a1c9c6a194ce8494feb66fa0237160926f9e0e6"
SRC_URI[digest-0.9.0.sha256sum] = "d3dd60d1080a57a05ab032377049e0591415d2b31afd7028356dbf3cc6dcb066"
SRC_URI[dirs-1.0.5.sha256sum] = "3fd78930633bd1c6e35c4b42b1df7b0cbc6bc191146e512bb3bedf243fcc3901"
SRC_URI[dirs-next-2.0.0.sha256sum] = "b98cf8ebf19c3d1b223e151f99a4f9f0690dca41414773390fc824184ac833e1"
SRC_URI[dirs-sys-next-0.1.2.sha256sum] = "4ebda144c4fe02d1f7ea1a7d9641b6fc6b580adcfa024ae48797ecdeb6825b4d"
SRC_URI[either-1.6.1.sha256sum] = "e78d4f1cc4ae33bbfc157ed5d5a5ef3bc29227303d595861deb238fcec4e9457"
SRC_URI[elfkit-0.0.4.sha256sum] = "0b374b649abc5a6cc89f2b4d20bc68b9fed1697d8d8c843c078852680fa96c0b"
SRC_URI[enum-primitive-derive-0.1.2.sha256sum] = "e2b90e520ec62c1864c8c78d637acbfe8baf5f63240f2fb8165b8325c07812dd"
SRC_URI[env_logger-0.6.2.sha256sum] = "aafcde04e90a5226a6443b7aabdb016ba2f8307c847d524724bd9b346dd1a2d3"
SRC_URI[env_logger-0.7.1.sha256sum] = "44533bbbb3bb3c1fa17d9f2e4e38bbbaf8396ba82193c4cb1b6445d711445d36"
SRC_URI[env_logger-0.8.4.sha256sum] = "a19187fea3ac7e84da7dacf48de0c45d63c6a76f9490dae389aead16c243fce3"
SRC_URI[errno-0.2.4.sha256sum] = "c2a071601ed01b988f896ab14b95e67335d1eeb50190932a1320f7fe3cadc84e"
SRC_URI[errno-0.2.8.sha256sum] = "f639046355ee4f37944e44f60642c6f3a7efa3cf6b78c78a0d989a8ce6c396a1"
SRC_URI[errno-dragonfly-0.1.1.sha256sum] = "14ca354e36190500e1e1fb267c647932382b54053c50b14970856c0b00a35067"
SRC_URI[errno-dragonfly-0.1.2.sha256sum] = "aa68f1b12764fab894d2755d2518754e71b4fd80ecfb822714a1206c2aab39bf"
SRC_URI[error-chain-0.11.0.sha256sum] = "ff511d5dc435d703f4971bc399647c9bc38e20cb41452e3b9feb4765419ed3f3"
SRC_URI[failure-0.1.8.sha256sum] = "d32e9bd16cc02eae7db7ef620b392808b89f6a5e16bb3497d159c6b92a0f4f86"
SRC_URI[failure_derive-0.1.8.sha256sum] = "aa4da3c766cd7a0db8242e326e9e4e081edd567072893ed320008189715366a4"
SRC_URI[fallible-iterator-0.2.0.sha256sum] = "4443176a9f2c162692bd3d352d745ef9413eec5782a80d8fd6f8a1ac692a07f7"
SRC_URI[filetime-0.2.13.sha256sum] = "0c122a393ea57648015bf06fbd3d372378992e86b9ff5a7a497b076a28c79efe"
SRC_URI[fixedbitset-0.1.9.sha256sum] = "86d4de0081402f5e88cdac65c8dcdcc73118c1a7a465e2a05f0da05843a8ea33"
SRC_URI[flate2-1.0.22.sha256sum] = "1e6988e897c1c9c485f43b47a529cef42fde0547f9d8d41a7062518f1d8fc53f"
SRC_URI[fs-set-times-0.13.1.sha256sum] = "aa838950e8e36a567ce96a945c303e88d9916ff97df27c315a0d263a72bd816f"
SRC_URI[fuchsia-cprng-0.1.1.sha256sum] = "a06f77d526c1a601b7c4cdd98f54b5eaabffc14d5f2f0296febdc7f357c6d3ba"
SRC_URI[funty-1.1.0.sha256sum] = "fed34cd105917e91daa4da6b3728c47b068749d6a62c59811f06ed2ac71d9da7"
SRC_URI[futures-core-0.3.17.sha256sum] = "88d1c26957f23603395cd326b0ffe64124b818f4449552f960d815cfba83a53d"
SRC_URI[futures-executor-0.3.17.sha256sum] = "45025be030969d763025784f7f355043dc6bc74093e4ecc5000ca4dc50d8745c"
SRC_URI[futures-task-0.3.17.sha256sum] = "1d3d00f4eddb73e498a54394f228cd55853bdf059259e8e7bc6e69d408892e99"
SRC_URI[futures-util-0.3.17.sha256sum] = "36568465210a3a6ee45e1f165136d68671471a501e632e9a98d96872222b5481"
SRC_URI[gcc-0.3.55.sha256sum] = "8f5f3913fa0bfe7ee1fd8248b6b9f42a5af4b9d65ec2dd2c3c26132b950ecfc2"
SRC_URI[generic-array-0.14.4.sha256sum] = "501466ecc8a30d1d3b7fc9229b122b2ce8ed6e9d9223f1138d4babb253e51817"
SRC_URI[getrandom-0.1.15.sha256sum] = "fc587bc0ec293155d5bfa6b9891ec18a1e330c234f896ea47fbada4cadbe47e6"
SRC_URI[getrandom-0.1.16.sha256sum] = "8fc3cb4d91f53b50155bdcfd23f6a4c39ae1969c2ae85982b135750cccaf5fce"
SRC_URI[getrandom-0.2.3.sha256sum] = "7fcd999463524c52659517fe2cea98493cfe485d10565e7b0fb07dbba7ad2753"
SRC_URI[gimli-0.25.0.sha256sum] = "f0a01e0497841a3b2db4f8afa483cce65f7e96a3498bd6c541734792aeac8fe7"
SRC_URI[gimli-0.26.1.sha256sum] = "78cc372d058dcf6d5ecd98510e7fbc9e5aec4d21de70f65fea8fecebcd881bd4"
SRC_URI[glob-0.2.11.sha256sum] = "8be18de09a56b60ed0edf84bc9df007e30040691af7acd1c41874faac5895bfb"
SRC_URI[glob-0.3.0.sha256sum] = "9b919933a397b79c37e33b77bb2aa3dc8eb6e165ad809e58ff75bc7db2e34574"
SRC_URI[goblin-0.0.20.sha256sum] = "84473a5302fa5094d3d9911c2f312f522f9a37462a777f195f63fae1bf7faf4d"
SRC_URI[goblin-0.0.21.sha256sum] = "6a4013e9182f2345c6b7829b9ef6e670bce0dfca12c6f974457ed2160c2c7fe9"
SRC_URI[goblin-0.0.24.sha256sum] = "e3fa261d919c1ae9d1e4533c4a2f99e10938603c4208d56c05bec7a872b661b0"
SRC_URI[goblin-0.4.3.sha256sum] = "32401e89c6446dcd28185931a01b1093726d0356820ac744023e6850689bf926"
SRC_URI[gzip-header-0.3.0.sha256sum] = "0131feb3d3bb2a5a238d8a4d09f6353b7ebfdc52e77bccbf4ea6eaa751dde639"
SRC_URI[half-1.8.2.sha256sum] = "eabb4a44450da02c90444cf74558da904edde8fb4e9035a9a6a4e15445af0bd7"
SRC_URI[hashbrown-0.11.2.sha256sum] = "ab5ef0d4909ef3724cc8cce6ccc8572c5c817592e9285f5464f8e86f8bd3726e"
SRC_URI[heck-0.3.1.sha256sum] = "20564e78d53d2bb135c343b3f47714a56af2061f1c928fdb541dc7b9fdd94205"
SRC_URI[heck-0.3.3.sha256sum] = "6d621efb26863f0e9924c6ac577e8275e5e6b77455db64ffa6c65c904e9e132c"
SRC_URI[hermit-abi-0.1.19.sha256sum] = "62b467343b94ba476dcb2500d242dadbb39557df889310ac77c5d99100aaac33"
SRC_URI[hmac-0.10.1.sha256sum] = "c1441c6b1e930e2817404b5046f1f989899143a12bf92de603b69f4e0aee1e15"
SRC_URI[hmac-0.11.0.sha256sum] = "2a2a2320eb7ec0ebe8da8f744d7812d9fc4cb4d09344ac01898dbcb6a20ae69b"
SRC_URI[httparse-1.3.4.sha256sum] = "cd179ae861f0c2e53da70d892f5f3029f9594be0c41dc5269cd371691b1dc2f9"
SRC_URI[human-size-0.4.1.sha256sum] = "f90b9d206a509fdc5034ea8ffb4d6ca080dd61883cfa222c480cfcba8c570368"
SRC_URI[humantime-1.3.0.sha256sum] = "df004cfca50ef23c36850aaaa59ad52cc70d0e90243c3c7737a4dd32dc7a3c4f"
SRC_URI[humantime-2.1.0.sha256sum] = "9a3a5bfb195931eeb336b2a7b4d761daec841b97f947d34394601737a7bba5e4"
SRC_URI[hwloc-0.5.0.sha256sum] = "2934f84993b8b4bcae9b6a4e5f0aca638462dda9c7b4f26a570241494f21e0f4"
SRC_URI[idna-0.1.5.sha256sum] = "38f09e0f0b1fb55fdee1f17470ad800da77af5186a1a76c026b679358b7e844e"
SRC_URI[indexmap-1.7.0.sha256sum] = "bc633605454125dec4b66843673f01c7df2b89479b32e0ed634e43a91cff62a5"
SRC_URI[instant-0.1.12.sha256sum] = "7a5bbe824c507c5da5956355e86a746d82e0e1464f65d862cc5e71da70e94b2c"
SRC_URI[io-extras-0.11.2.sha256sum] = "2a1d9a66d8b0312e3601a04a2dcf8f0ddd873319560ddeabe2110fa1e5af781a"
SRC_URI[io-lifetimes-0.3.3.sha256sum] = "278e90d6f8a6c76a8334b336e306efa3c5f2b604048cbfd486d6f49878e3af14"
SRC_URI[ipnet-2.3.1.sha256sum] = "68f2d64f2edebec4ce84ad108148e67e1064789bee435edc5b60ad398714a3a9"
SRC_URI[itertools-0.10.1.sha256sum] = "69ddb889f9d0d08a67338271fa9b62996bc788c7796a5c18cf057420aaed5eaf"
SRC_URI[itertools-0.6.5.sha256sum] = "d3f2be4da1690a039e9ae5fd575f706a63ad5a2120f161b1d653c9da3930dd21"
SRC_URI[itoa-0.4.3.sha256sum] = "1306f3464951f30e30d12373d31c79fbd52d236e5e896fd92f96ec7babbbe60b"
SRC_URI[itoa-0.4.8.sha256sum] = "b71991ff56294aa922b450139ee08b3bfc70982c6b2c7562771375cf73542dd4"
SRC_URI[js-sys-0.3.55.sha256sum] = "7cc9ffccd38c451a86bf13657df244e9c3f37493cce8e5e21e940963777acc84"
SRC_URI[kernel32-sys-0.2.2.sha256sum] = "7507624b29483431c0ba2d82aece8ca6cdba9382bff4ddd0f7490560c056098d"
SRC_URI[lazy_static-1.4.0.sha256sum] = "e2abad23fbc42b3700f2f279844dc832adb2b2eb069b2df918f455c4e18cc646"
SRC_URI[lazycell-1.3.0.sha256sum] = "830d08ce1d1d941e6b30645f1a0eb5643013d835ce3779a5fc208261dbe10f55"
SRC_URI[leb128-0.2.4.sha256sum] = "3576a87f2ba00f6f106fdfcd16db1d698d648a26ad8e0573cad8537c3c362d2a"
SRC_URI[leb128-0.2.5.sha256sum] = "884e2677b40cc8c339eaefcb701c32ef1fd2493d71118dc0ca4b6a736c93bd67"
SRC_URI[libc-0.2.105.sha256sum] = "869d572136620d55835903746bcb5cdc54cb2851fd0aeec53220b4bb65ef3013"
SRC_URI[libc-0.2.81.sha256sum] = "1482821306169ec4d07f6aca392a4681f66c75c9918aa49641a2595db64053cb"
SRC_URI[libfuzzer-sys-0.3.5.sha256sum] = "fcf184a4b6b274f82a5df6b357da6055d3e82272327bba281c28bbba6f1664ef"
SRC_URI[libloading-0.5.0.sha256sum] = "9c3ad660d7cb8c5822cd83d10897b0f1f1526792737a179e73896152f85b88c2"
SRC_URI[libloading-0.6.6.sha256sum] = "e9367bdfa836b7e3cf895867f7a570283444da90562980ec2263d6e1569b16bc"
SRC_URI[libloading-0.6.7.sha256sum] = "351a32417a12d5f7e82c368a66781e307834dae04c6ce0cd4456d52989229883"
SRC_URI[libloading-0.7.1.sha256sum] = "c0cf036d15402bea3c5d4de17b3fce76b3e4a56ebc1f577be0e7a72f7c607cf0"
SRC_URI[libproc-0.9.1.sha256sum] = "15fb50befee2d3be15b38c93ef79ba22ecbd667874bf692309ffdff179282b8d"
SRC_URI[linux-raw-sys-0.0.36.sha256sum] = "a261afc61b7a5e323933b402ca6a1765183687c614789b1e4db7762ed4230bca"
SRC_URI[lock_api-0.4.5.sha256sum] = "712a4d093c9976e24e7dbca41db895dabcbac38eb5f4045393d17a95bdfb1109"
SRC_URI[log-0.3.9.sha256sum] = "e19e8d5c34a3e0e2223db8e060f9e8264aeeb5c5fc64a4ee9965c062211c024b"
SRC_URI[log-0.4.11.sha256sum] = "4fabed175da42fed1fa0746b0ea71f412aa9d35e76e95e59b192c64b9dc2bf8b"
SRC_URI[log-0.4.14.sha256sum] = "51b9bbe6c47d51fc3e1a9b945965946b4c44142ab8792c50835a980d362c2710"
SRC_URI[lucet-module-0.5.1.sha256sum] = "459f28aa6ebe74ff4e00073e0a4c85e25900dbf6109b54224c2be607046a0580"
SRC_URI[mach-0.3.2.sha256sum] = "b823e83b2affd8f40a9ee8c29dbc56404c1e34cd2710921f2801e2cf29527afa"
SRC_URI[matchers-0.1.0.sha256sum] = "8263075bb86c5a1b1427b5ae862e8889656f126e9f77c484496e8b47cf5c5558"
SRC_URI[matches-0.1.8.sha256sum] = "7ffc5c5338469d4d3ea17d269fa8ea3512ad247247c30bd2df69e68309ed0a08"
SRC_URI[maybe-owned-0.3.4.sha256sum] = "4facc753ae494aeb6e3c22f839b158aebd4f9270f55cd3c79906c45476c47ab4"
SRC_URI[memchr-2.3.4.sha256sum] = "0ee1c47aaa256ecabcaea351eae4a9b01ef39ed810004e298d2511ed284b1525"
SRC_URI[memchr-2.4.1.sha256sum] = "308cc39be01b73d0d18f82a0e7b2a3df85245f84af96fdddc5d202d27e47b86a"
SRC_URI[memoffset-0.5.6.sha256sum] = "043175f069eda7b85febe4a74abbaeff828d9f8b448515d3151a14a3542811aa"
SRC_URI[memoffset-0.6.4.sha256sum] = "59accc507f1338036a0477ef61afdae33cde60840f4dfe481319ce3ad116ddf9"
SRC_URI[mime-0.2.6.sha256sum] = "ba626b8a6de5da682e1caa06bdb42a335aee5a84db8e5046a3e8ab17ba0a3ae0"
SRC_URI[mime_guess-1.8.8.sha256sum] = "216929a5ee4dd316b1702eedf5e74548c123d370f47841ceaac38ca154690ca3"
SRC_URI[minisign-0.5.23.sha256sum] = "80db40007b46085d83469f71912d95526791038200e1c00afc6a5494d7dc8a4f"
SRC_URI[minisign-0.7.0.sha256sum] = "43935b78ea0886357ab9259bd227879a54b12a83de261c3270aad584500cba2f"
SRC_URI[miniz_oxide-0.4.4.sha256sum] = "a92518e98c078586bc6c934028adcca4c92a53d6a958196de835170a01d84e4b"
SRC_URI[mio-0.7.14.sha256sum] = "8067b404fe97c70829f082dec8bcf4f71225d7eaea1d8645349cb76fa06205cc"
SRC_URI[miow-0.3.7.sha256sum] = "b9f1c5b025cda876f66ef43a113f91ebc9f4ccef34843000e0adf6ebbab84e21"
SRC_URI[more-asserts-0.2.1.sha256sum] = "0debeb9fcf88823ea64d64e4a815ab1643f33127d995978e099942ce38f25238"
SRC_URI[multipart-0.15.4.sha256sum] = "adba94490a79baf2d6a23eac897157047008272fa3eecb3373ae6377b91eca28"
SRC_URI[mvdb-0.3.0.sha256sum] = "f761897c1fd598fbec8e4411a822f8fdba72b5fdb13b3f04271ba5739e965c7e"
SRC_URI[nix-0.12.1.sha256sum] = "319fffb13b63c0f4ff5a4e1c97566e7e741561ff5d03bf8bbf11653454bbd70b"
SRC_URI[nix-0.23.0.sha256sum] = "f305c2c2e4c39a82f7bf0bf65fb557f9070ce06781d4f2454295cc34b1c43188"
SRC_URI[nom-6.1.2.sha256sum] = "e7413f999671bd4745a7b624bd370a569fb6bc574b23c83a3c5ed2e453f3d5e2"
SRC_URI[ntapi-0.3.6.sha256sum] = "3f6bb902e437b6d86e03cce10a7e2af662292c5dfef23b65899ea3ac9354ad44"
SRC_URI[num-0.1.42.sha256sum] = "4703ad64153382334aa8db57c637364c322d3372e097840c72000dabdcf6156e"
SRC_URI[num-derive-0.3.3.sha256sum] = "876a53fff98e03a936a674b29568b0e605f06b29372c2489ff4de23f1949743d"
SRC_URI[num-integer-0.1.39.sha256sum] = "e83d528d2677f0518c570baf2b7abdcf0cd2d248860b68507bdcb3e91d4c0cea"
SRC_URI[num-iter-0.1.37.sha256sum] = "af3fdbbc3291a5464dc57b03860ec37ca6bf915ed6ee385e7c6c052c422b2124"
SRC_URI[num-traits-0.1.43.sha256sum] = "92e5113e9fd4cc14ded8e499429f396a20f98c772a47cc8622a736e1ec843c31"
SRC_URI[num-traits-0.2.14.sha256sum] = "9a64b1ec5cda2586e284722486d802acf1f7dbdc623e2bfc57e65ca1cd099290"
SRC_URI[num-traits-0.2.6.sha256sum] = "0b3a5d7cc97d6d30d8b9bc8fa19bf45349ffe46241e8816f50f62f6d6aaabee1"
SRC_URI[num_cpus-1.10.0.sha256sum] = "1a23f0ed30a54abaa0c7e83b1d2d87ada7c3c23078d1d87815af3e3b6385fbba"
SRC_URI[num_cpus-1.13.0.sha256sum] = "05499f3756671c15885fee9034446956fff3f243d6077b91e5767df161f766b3"
SRC_URI[numtoa-0.1.0.sha256sum] = "b8f8bdf33df195859076e54ab11ee78a1b208382d3a26ec40d142ffc1ecc49ef"
SRC_URI[object-0.14.1.sha256sum] = "a411a7fd46b7ebc9849c80513c84280f41cbc3159f489cd77fb30ecefdd1218a"
SRC_URI[object-0.21.1.sha256sum] = "37fd5004feb2ce328a52b0b3d01dbf4ffff72583493900ed15f22d4111c51693"
SRC_URI[object-0.22.0.sha256sum] = "8d3b63360ec3cb337817c2dbd47ab4a0f170d285d8e5a2064600f3def1402397"
SRC_URI[object-0.27.1.sha256sum] = "67ac1d3f9a1d3616fd9a60c8d74296f22406a238b6a72f5cc1e6f314df4ffbf9"
SRC_URI[once_cell-1.8.0.sha256sum] = "692fcb63b64b1758029e0a96ee63e049ce8c5948587f2f7208df04625e5f6b56"
SRC_URI[oorandom-11.1.3.sha256sum] = "0ab1bc2a289d34bd04a330323ac98a1b4bc82c9d9fcb1e66b63caa84da26b575"
SRC_URI[opaque-debug-0.3.0.sha256sum] = "624a8340c38c1b80fd549087862da4ba43e08858af025b236e509b6649fc13d5"
SRC_URI[ordermap-0.3.5.sha256sum] = "a86ed3f5f244b372d6b1a00b72ef7f8876d0bc6a78a4c9985c53614041512063"
SRC_URI[parity-wasm-0.40.3.sha256sum] = "1e39faaa292a687ea15120b1ac31899b13586446521df6c149e46f1584671e0f"
SRC_URI[parking_lot-0.11.2.sha256sum] = "7d17b78036a60663b797adeaee46f5c9dfebb86948d1255007a1d6be0271ff99"
SRC_URI[parking_lot_core-0.8.5.sha256sum] = "d76e8e1493bcac0d2766c42737f34458f1c8c50c0d23bcb24ea953affb273216"
SRC_URI[paste-1.0.5.sha256sum] = "acbf547ad0c65e31259204bd90935776d1c693cec2f4ff7abb7a1bbbd40dfe58"
SRC_URI[pbkdf2-0.6.0.sha256sum] = "b3b8c0d71734018084da0c0354193a5edfb81b20d2d57a92c5b154aefc554a4a"
SRC_URI[pbkdf2-0.9.0.sha256sum] = "f05894bce6a1ba4be299d0c5f29563e08af2bc18bb7d48313113bed71e904739"
SRC_URI[peeking_take_while-0.1.2.sha256sum] = "19b17cddbe7ec3f8bc800887bab5e717348c95ea2ca0b1bf0837fb964dc67099"
SRC_URI[percent-encoding-1.0.1.sha256sum] = "31010dd2e1ac33d5b46a5b413495239882813e0369f8ed8a5e266f173602f831"
SRC_URI[perf-event-0.4.6.sha256sum] = "b7a1c2678a77d65edf773bd900f5b87f0944ac3421949842a2c6a4efe42d6c66"
SRC_URI[perf-event-open-sys-1.0.1.sha256sum] = "ce9bedf5da2c234fdf2391ede2b90fabf585355f33100689bc364a3ea558561a"
SRC_URI[petgraph-0.4.13.sha256sum] = "9c3659d1ee90221741f65dd128d9998311b0e40c5d3c23a62445938214abce4f"
SRC_URI[phf-0.7.24.sha256sum] = "b3da44b85f8e8dfaec21adae67f95d93244b2ecf6ad2a692320598dcc8e6dd18"
SRC_URI[phf_codegen-0.7.24.sha256sum] = "b03e85129e324ad4166b06b2c7491ae27fe3ec353af72e72cd1654c7225d517e"
SRC_URI[phf_generator-0.7.24.sha256sum] = "09364cc93c159b8b06b1f4dd8a4398984503483891b0c26b867cf431fb132662"
SRC_URI[phf_shared-0.7.24.sha256sum] = "234f71a15de2288bcb7e3b6515828d22af7ec8598ee6d24c3b526fa0a80b67a0"
SRC_URI[pin-project-lite-0.2.7.sha256sum] = "8d31d11c69a6b52a174b42bdc0c30e5e11670f90788b2c471c31c1d17d449443"
SRC_URI[pin-utils-0.1.0.sha256sum] = "8b870d8c151b6f2fb93e84a13146138f05d02ed11c7e7c54f8826aaaf7c9f184"
SRC_URI[pkg-config-0.3.14.sha256sum] = "676e8eb2b1b4c9043511a9b7bea0915320d7e502b0a079fb03f9635a5252b18c"
SRC_URI[plain-0.2.3.sha256sum] = "b4596b6d070b27117e987119b4dac604f3c58cfb0b191112e24771b2faeac1a6"
SRC_URI[plotters-0.3.1.sha256sum] = "32a3fd9ec30b9749ce28cd91f255d569591cdf937fe280c312143e3c4bad6f2a"
SRC_URI[plotters-backend-0.3.2.sha256sum] = "d88417318da0eaf0fdcdb51a0ee6c3bed624333bff8f946733049380be67ac1c"
SRC_URI[plotters-svg-0.3.1.sha256sum] = "521fa9638fa597e1dc53e9412a4f9cefb01187ee1f7413076f9e6749e2885ba9"
SRC_URI[ppv-lite86-0.2.10.sha256sum] = "ac74c624d6b2d21f425f752262f42188365d7b8ff1aff74c82e45136510a4857"
SRC_URI[ppv-lite86-0.2.15.sha256sum] = "ed0cfbc8191465bed66e1718596ee0b0b35d5ee1f41c5df2189d0fe8bde535ba"
SRC_URI[precision-0.1.11.sha256sum] = "3d800f775685df7c29c60971217bcfb908bd98c807ce8346cba9fe77df9a9dcc"
SRC_URI[pretty_env_logger-0.4.0.sha256sum] = "926d36b9553851b8b0005f1275891b392ee4d2d833852c417ed025477350fb9d"
SRC_URI[printtable-0.1.0.sha256sum] = "69967dae4cac71681361899d9905d3d2985fc989d7afb32a8dff3aed5461ecdf"
SRC_URI[proc-macro-error-1.0.4.sha256sum] = "da25490ff9892aab3fcf7c36f08cfb902dd3e71ca0f9f9517bea02a73a5ce38c"
SRC_URI[proc-macro-error-attr-1.0.4.sha256sum] = "a1be40180e52ecc98ad80b184934baf3d0d29f979574e439af5a55274b35f869"
SRC_URI[proc-macro2-0.4.27.sha256sum] = "4d317f9caece796be1980837fd5cb3dfec5613ebdb04ad0956deea83ce168915"
SRC_URI[proc-macro2-0.4.30.sha256sum] = "cf3d2011ab5c909338f7887f4fc896d35932e29146c12c8d01da6b22a80ba759"
SRC_URI[proc-macro2-1.0.24.sha256sum] = "1e0704ee1a7e00d7bb417d0770ea303c1bccbabf0ef1667dae92b5967f5f8a71"
SRC_URI[proc-macro2-1.0.32.sha256sum] = "ba508cc11742c0dc5c1659771673afbab7a0efab23aa17e854cbab0837ed0b43"
SRC_URI[proc-maps-0.1.8.sha256sum] = "1f7e49bf46401bf141cb9d2bba151efcfa85f2956e51c6794fe07a3803ec6004"
SRC_URI[progress-0.2.0.sha256sum] = "17b820305721858696053a7fd0215cfeeee16ecaaf96b7a209945428e02f1c44"
SRC_URI[psm-0.1.16.sha256sum] = "cd136ff4382c4753fc061cb9e4712ab2af263376b95bbd5bd8cd50c020b78e69"
SRC_URI[quick-error-1.2.3.sha256sum] = "a1d01941d82fa2ab50be1e79e6714289dd7cde78eba4c074bc5a4374f650dfe0"
SRC_URI[quote-0.3.15.sha256sum] = "7a6e920b65c65f10b2ae65c831a81a073a89edd28c7cce89475bff467ab4167a"
SRC_URI[quote-0.6.11.sha256sum] = "cdd8e04bd9c52e0342b406469d494fcb033be4bdbe5c606016defbb1681411e1"
SRC_URI[quote-0.6.13.sha256sum] = "6ce23b6b870e8f94f81fb0a363d65d86675884b34a09043c81e5562f11c1f8e1"
SRC_URI[quote-1.0.10.sha256sum] = "38bc8cc6a5f2e3655e0899c1b848643b2562f853f114bfec7be120678e3ace05"
SRC_URI[quote-1.0.7.sha256sum] = "aa563d17ecb180e500da1cfd2b028310ac758de548efdd203e18f283af693f37"
SRC_URI[radium-0.5.3.sha256sum] = "941ba9d78d8e2f7ce474c015eea4d9c6d25b6a3327f9832ee29a4de27f91bbb8"
SRC_URI[rand-0.4.6.sha256sum] = "552840b97013b1a26992c11eac34bdd778e464601a4c2054b5f0bff7c6761293"
SRC_URI[rand-0.5.6.sha256sum] = "c618c47cd3ebd209790115ab837de41425723956ad3ce2e6a7f09890947cacb9"
SRC_URI[rand-0.6.5.sha256sum] = "6d71dacdc3c88c1fde3885a3be3fbab9f35724e6ce99467f7d9c5026132184ca"
SRC_URI[rand-0.7.3.sha256sum] = "6a6b1679d49b24bbfe0c803429aa1874472f50d9b363131f0e89fc356b544d03"
SRC_URI[rand-0.8.4.sha256sum] = "2e7573632e6454cf6b99d7aac4ccca54be06da05aca2ef7423d22d27d4d4bcd8"
SRC_URI[rand_chacha-0.1.1.sha256sum] = "556d3a1ca6600bfcbab7c7c91ccb085ac7fbbcd70e008a98742e7847f4f7bcef"
SRC_URI[rand_chacha-0.2.2.sha256sum] = "f4c8ed856279c9737206bf725bf36935d8666ead7aa69b52be55af369d193402"
SRC_URI[rand_chacha-0.3.1.sha256sum] = "e6c10a63a0fa32252be49d21e7709d4d4baf8d231c2dbce1eaa8141b9b127d88"
SRC_URI[rand_core-0.3.1.sha256sum] = "7a6fdeb83b075e8266dcc8762c22776f6877a63111121f5f8c7411e5be7eed4b"
SRC_URI[rand_core-0.4.2.sha256sum] = "9c33a3c44ca05fa6f1807d8e6743f3824e8509beca625669633be0acbdf509dc"
SRC_URI[rand_core-0.5.1.sha256sum] = "90bde5296fc891b0cef12a6d03ddccc162ce7b2aff54160af9338f8d40df6d19"
SRC_URI[rand_core-0.6.3.sha256sum] = "d34f1408f55294453790c48b2f1ebbb1c5b4b7563eb1f418bcfcfdbb06ebb4e7"
SRC_URI[rand_hc-0.1.0.sha256sum] = "7b40677c7be09ae76218dc623efbf7b18e34bced3f38883af07bb75630a21bc4"
SRC_URI[rand_hc-0.2.0.sha256sum] = "ca3129af7b92a17112d59ad498c6f81eaf463253766b90396d39ea7a39d6613c"
SRC_URI[rand_hc-0.3.1.sha256sum] = "d51e9f596de227fda2ea6c84607f5558e196eeaf43c986b724ba4fb8fdf497e7"
SRC_URI[rand_isaac-0.1.1.sha256sum] = "ded997c9d5f13925be2a6fd7e66bf1872597f759fd9dd93513dd7e92e5a5ee08"
SRC_URI[rand_jitter-0.1.4.sha256sum] = "1166d5c91dc97b88d1decc3285bb0a99ed84b05cfd0bc2341bdf2d43fc41e39b"
SRC_URI[rand_os-0.1.3.sha256sum] = "7b75f676a1e053fc562eafbb47838d67c84801e38fc1ba459e8f180deabd5071"
SRC_URI[rand_pcg-0.1.2.sha256sum] = "abf9b09b01790cfe0364f52bf32995ea3c39f4d2dd011eac241d2914146d0b44"
SRC_URI[rand_pcg-0.2.1.sha256sum] = "16abd0c1b639e9eb4d7c50c0b8100b0d0f849be2349829c740fe8e6eb4816429"
SRC_URI[rand_xorshift-0.1.1.sha256sum] = "cbf7e9e623549b0e21f6e97cf8ecf247c1a8fd2e8a992ae265314300b2455d5c"
SRC_URI[raw-cpuid-9.1.1.sha256sum] = "1733f6f80c9c24268736a501cd00d41a9849b4faa7a9f9334c096e5d10553206"
SRC_URI[rayon-1.5.1.sha256sum] = "c06aca804d41dbc8ba42dfd964f0d01334eceb64314b9ecf7c5fad5188a06d90"
SRC_URI[rayon-core-1.9.1.sha256sum] = "d78120e2c850279833f1dd3582f730c4ab53ed95aeaaaa862a2a5c71b1656d8e"
SRC_URI[rdrand-0.4.0.sha256sum] = "678054eb77286b51581ba43620cc911abf02758c91f93f479767aed0f90458b2"
SRC_URI[redox_syscall-0.1.52.sha256sum] = "d32b3053e5ced86e4bc0411fec997389532bf56b000e66cb4884eeeb41413d69"
SRC_URI[redox_syscall-0.2.10.sha256sum] = "8383f39639269cde97d255a32bdb68c047337295414940c68bdd30c2e13203ff"
SRC_URI[redox_termios-0.1.1.sha256sum] = "7e891cfe48e9100a70a3b6eb652fef28920c117d366339687bd5576160db0f76"
SRC_URI[redox_termios-0.1.2.sha256sum] = "8440d8acb4fd3d277125b4bd01a6f38aee8d814b3b5fc09b3f2b825d37d3fe8f"
SRC_URI[redox_users-0.3.5.sha256sum] = "de0737333e7a9502c789a36d7c7fa6092a49895d4faa31ca5df163857ded2e9d"
SRC_URI[redox_users-0.4.0.sha256sum] = "528532f3d801c87aec9def2add9ca802fe569e44a544afe633765267840abe64"
SRC_URI[regalloc-0.0.33.sha256sum] = "7d808cff91dfca7b239d40b972ba628add94892b1d9e19a842aedc5cfae8ab1a"
SRC_URI[regex-1.4.2.sha256sum] = "38cf2c13ed4745de91a5eb834e11c00bcc3709e773173b2ce4c56c9fbde04b9c"
SRC_URI[regex-1.5.4.sha256sum] = "d07a8629359eb56f1e2fb1652bb04212c072a87ba68546a04065d525673ac461"
SRC_URI[regex-automata-0.1.10.sha256sum] = "6c230d73fb8d8c1b9c0b3135c5142a8acee3a0558fb8db5cf1cb65f8d7862132"
SRC_URI[regex-automata-0.1.9.sha256sum] = "ae1ded71d66a4a97f5e961fd0cb25a5f366a42a41570d16a763a69c092c26ae4"
SRC_URI[regex-syntax-0.6.21.sha256sum] = "3b181ba2dcf07aaccad5448e8ead58db5b742cf85dfe035e2227f137a539a189"
SRC_URI[regex-syntax-0.6.25.sha256sum] = "f497285884f3fcff424ffc933e56d7cbca511def0c9831a7f9b5f6153e3cc89b"
SRC_URI[region-2.2.0.sha256sum] = "877e54ea2adcd70d80e9179344c97f93ef0dffd6b03e1f4529e6e83ab2fa9ae0"
SRC_URI[remove_dir_all-0.5.3.sha256sum] = "3acd125665422973a33ac9d3dd2df85edad0f4ae9b00dafb1a05e43a9f5ef8e7"
SRC_URI[rouille-3.0.0.sha256sum] = "112568052ec17fa26c6c11c40acbb30d3ad244bf3d6da0be181f5e7e42e5004f"
SRC_URI[rpassword-5.0.1.sha256sum] = "ffc936cf8a7ea60c58f030fd36a612a48f440610214dc54bc36431f9ea0c3efb"
SRC_URI[rust-argon2-0.8.3.sha256sum] = "4b18820d944b33caa75a71378964ac46f58517c92b6ae5f762636247c09e78fb"
SRC_URI[rustc-demangle-0.1.13.sha256sum] = "adacaae16d02b6ec37fdc7acfcddf365978de76d1983d3ee22afc260e1ca9619"
SRC_URI[rustc-demangle-0.1.21.sha256sum] = "7ef03e0a2b150c7a90d01faf6254c9c48a41e95fb2a8c2ac1c6f0d2b9aefc342"
SRC_URI[rustc-hash-1.1.0.sha256sum] = "08d43f7aa6b08d49f382cde6a7982047c3426db949b1424bc4b7ec9ae12c6ce2"
SRC_URI[rustc_version-0.2.3.sha256sum] = "138e3e0acb6c9fb258b19b67cb8abd63c00679d2851805ea151465464fe9030a"
SRC_URI[rustc_version-0.4.0.sha256sum] = "bfa0f585226d2e68097d4f95d113b15b83a82e819ab25717ec0590d9584ef366"
SRC_URI[rustix-0.26.2.sha256sum] = "18c44018277ec7195538f5631b90def7ad975bb46370cb0f4eff4012de9333f8"
SRC_URI[ryu-1.0.5.sha256sum] = "71d301d4193d031abdd79ff7e3dd721168a9572ef3fe51a1517aba235bd8f86e"
SRC_URI[safemem-0.3.3.sha256sum] = "ef703b7cb59335eae2eb93ceb664c0eb7ea6bf567079d843e09420219668e072"
SRC_URI[salsa20-0.7.2.sha256sum] = "399f290ffc409596022fce5ea5d4138184be4784f2b28c62c59f0d8389059a15"
SRC_URI[salsa20-0.8.1.sha256sum] = "ecbd2eb639fd7cab5804a0837fe373cc2172d15437e804c054a9fb885cb923b0"
SRC_URI[same-file-1.0.6.sha256sum] = "93fc1dc3aaa9bfed95e02e6eadabb4baf7e3078b0bd1b4d7b6b0b68378900502"
SRC_URI[scopeguard-1.1.0.sha256sum] = "d29ab0c6d3fc0ee92fe66e2d99f700eab17a8d57d1c1d3b748380fb20baa78cd"
SRC_URI[scroll-0.10.2.sha256sum] = "fda28d4b4830b807a8b43f7b0e6b5df875311b3e7621d84577188c175b6ec1ec"
SRC_URI[scroll-0.9.2.sha256sum] = "2f84d114ef17fd144153d608fba7c446b0145d038985e7a8cc5d08bb0ce20383"
SRC_URI[scroll_derive-0.10.5.sha256sum] = "aaaae8f38bb311444cfb7f1979af0bc9240d95795f75f9ceddf6a59b79ceffa0"
SRC_URI[scroll_derive-0.9.5.sha256sum] = "8f1aa96c45e7f5a91cb7fabe7b279f02fea7126239fc40b732316e8b6a2d0fcb"
SRC_URI[scrypt-0.5.0.sha256sum] = "8da492dab03f925d977776a0b7233d7b934d6dc2b94faead48928e2e9bacedb9"
SRC_URI[scrypt-0.8.0.sha256sum] = "9f2cc535b6997b0c755bf9344e71ca0e1be070d07ff792f1fcd31e7b90e07d5f"
SRC_URI[semver-0.9.0.sha256sum] = "1d7eb9ef2c18661902cc47e535f9bc51b78acd254da71d375c2f6720d9a40403"
SRC_URI[semver-1.0.4.sha256sum] = "568a8e6258aa33c13358f81fd834adb854c6f7c9468520910a9b1e8fac068012"
SRC_URI[semver-parser-0.7.0.sha256sum] = "388a1df253eca08550bef6c72392cfe7c30914bf41df5269b68cbd6ff8f570a3"
SRC_URI[serde-1.0.118.sha256sum] = "06c64263859d87aa2eb554587e2d23183398d617427327cf2b3d0ed8c69e4800"
SRC_URI[serde-1.0.130.sha256sum] = "f12d06de37cf59146fbdecab66aa99f9fe4f78722e3607577a5375d66bd0c913"
SRC_URI[serde-big-array-0.2.0.sha256sum] = "883eee5198ea51720eab8be52a36cf6c0164ac90eea0ed95b649d5e35382404e"
SRC_URI[serde_cbor-0.11.2.sha256sum] = "2bef2ebfde456fb76bbcf9f59315333decc4fda0b2b44b420243c11e0f5ec1f5"
SRC_URI[serde_derive-1.0.118.sha256sum] = "c84d3526699cd55261af4b941e4e725444df67aa4f9e6a3564f18030d12672df"
SRC_URI[serde_derive-1.0.130.sha256sum] = "d7bc1a1ab1961464eae040d96713baa5a724a8152c1222492465b54322ec508b"
SRC_URI[serde_json-1.0.60.sha256sum] = "1500e84d27fe482ed1dc791a56eddc2f230046a040fa908c08bda1d9fb615779"
SRC_URI[serde_json-1.0.68.sha256sum] = "0f690853975602e1bfe1ccbf50504d67174e3bcf340f23b5ea9992e0587a52d8"
SRC_URI[sha1-0.6.0.sha256sum] = "2579985fda508104f7587689507983eadd6a6e84dd35d6d115361f530916fa0d"
SRC_URI[sha2-0.9.8.sha256sum] = "b69f9a4c9740d74c5baa3fd2e547f9525fa8088a8a958e0ca2409a514e33f5fa"
SRC_URI[sharded-slab-0.1.4.sha256sum] = "900fba806f70c630b0a382d0d825e17a0f19fcd059a2ade1ff237bcddf446b31"
SRC_URI[shellexpand-2.1.0.sha256sum] = "83bdb7831b2d85ddf4a7b148aa19d0587eddbe8671a436b7bd1182eaad0f2829"
SRC_URI[shlex-1.1.0.sha256sum] = "43b2853a4d09f215c24cc5489c992ce46052d359b5109343cbafbf26bc62f8a3"
SRC_URI[signal-hook-0.1.17.sha256sum] = "7e31d442c16f047a671b5a71e2161d6e68814012b7f5379d269ebd915fac2729"
SRC_URI[signal-hook-registry-1.4.0.sha256sum] = "e51e73328dc4ac0c7ccbda3a494dfa03df1de2f46018127f60c693f2648455b0"
SRC_URI[siphasher-0.2.3.sha256sum] = "0b8de496cf83d4ed58b6be86c3a275b8602f6ffe98d3024a869e124147a9a3ac"
SRC_URI[siphasher-0.3.7.sha256sum] = "533494a8f9b724d33625ab53c6c4800f7cc445895924a8ef649222dcb76e938b"
SRC_URI[slab-0.4.5.sha256sum] = "9def91fd1e018fe007022791f865d0ccc9b3a0d5001e01aabb8b40e46000afb5"
SRC_URI[smallvec-1.7.0.sha256sum] = "1ecab6c735a6bb4139c0caafd0cc3635748bbb3acf4550e8138122099251f309"
SRC_URI[stable_deref_trait-1.2.0.sha256sum] = "a8f112729512f8e442d81f95a8a7ddf2b7c6b8a1a6f509a95864142b30cab2d3"
SRC_URI[strsim-0.8.0.sha256sum] = "8ea5119cdb4c55b55d432abb513a0429384878c15dde60cc77b1c99de1a95a6a"
SRC_URI[structopt-0.3.21.sha256sum] = "5277acd7ee46e63e5168a80734c9f6ee81b1367a7d8772a2d765df2a3705d28c"
SRC_URI[structopt-0.3.25.sha256sum] = "40b9788f4202aa75c240ecc9c15c65185e6a39ccdeb0fd5d008b98825464c87c"
SRC_URI[structopt-derive-0.4.14.sha256sum] = "5ba9cdfda491b814720b6b06e0cac513d922fc407582032e8706e9f137976f90"
SRC_URI[structopt-derive-0.4.18.sha256sum] = "dcb5ae327f9cc13b68763b5749770cb9e048a99bd9dfdfa58d0cf05d5f64afe0"
SRC_URI[subtle-2.3.0.sha256sum] = "343f3f510c2915908f155e94f17220b19ccfacf2a64a2a5d8004f2c3e311e7fd"
SRC_URI[subtle-2.4.1.sha256sum] = "6bdef32e8150c2a081110b42772ffe7d7c9032b606bc226c8260fd97e0976601"
SRC_URI[syn-0.11.11.sha256sum] = "d3b891b9015c88c576343b9b3e41c2c11a51c219ef067b264bd9c8aa9b441dad"
SRC_URI[syn-0.15.30.sha256sum] = "66c8865bf5a7cbb662d8b011950060b3c8743dca141b054bf7195b20d314d8e2"
SRC_URI[syn-0.15.44.sha256sum] = "9ca4b3b69a77cbe1ffc9e198781b7acb0c7365a883670e8f1c1bc66fba79a5c5"
SRC_URI[syn-1.0.54.sha256sum] = "9a2af957a63d6bd42255c359c93d9bfdb97076bd3b820897ce55ffbfbf107f44"
SRC_URI[syn-1.0.81.sha256sum] = "f2afee18b8beb5a596ecb4a2dce128c719b4ba399d34126b9e4396e3f9860966"
SRC_URI[synom-0.11.3.sha256sum] = "a393066ed9010ebaed60b9eafa373d4b1baac186dd7e008555b0f702b51945b6"
SRC_URI[synstructure-0.12.6.sha256sum] = "f36bdaa60a83aca3921b5259d5400cbf5e90fc51931376a9bd4a0eb79aa7210f"
SRC_URI[system-interface-0.16.0.sha256sum] = "b1b5163055c386394170493ec1827cf7975035dc0bb23dcb7070bd1b1f672baa"
SRC_URI[tap-1.0.1.sha256sum] = "55937e1799185b12863d447f42597ed69d9928686b8d88a1df17376a097d8369"
SRC_URI[target-lexicon-0.11.2.sha256sum] = "422045212ea98508ae3d28025bc5aaa2bd4a9cdaecd442a08da2ee620ee9ea95"
SRC_URI[target-lexicon-0.12.2.sha256sum] = "d9bffcddbc2458fa3e6058414599e3c838a022abae82e5c67b4f7f80298d5bff"
SRC_URI[target-lexicon-0.8.1.sha256sum] = "7975cb2c6f37d77b190bc5004a2bb015971464756fde9514651a525ada2a741a"
SRC_URI[task-group-0.2.1.sha256sum] = "8b1f3bc29b7364b729d029b3db5b1e921cf6f43c074037e0b7a9f2ef45c18a4d"
SRC_URI[tempdir-0.3.7.sha256sum] = "15f2b5fb00ccdf689e0149d1b1b3c03fead81c2b37735d812fa8bddbbf41b6d8"
SRC_URI[tempfile-3.2.0.sha256sum] = "dac1c663cfc93810f88aed9b8941d48cabf856a1b111c29a40439018d870eb22"
SRC_URI[term-0.5.2.sha256sum] = "edd106a334b7657c10b7c540a0106114feadeb4dc314513e97df481d5d966f42"
SRC_URI[termcolor-1.1.2.sha256sum] = "2dfed899f0eb03f32ee8c6a0aabdb8a7949659e3466561fc0adf54e26d88c5f4"
SRC_URI[terminal_size-0.1.17.sha256sum] = "633c1a546cee861a1a6d0dc69ebeca693bf4296661ba7852b9d21d159e0506df"
SRC_URI[termion-1.5.1.sha256sum] = "689a3bdfaab439fd92bc87df5c4c78417d3cbe537487274e9b0b2dce76e92096"
SRC_URI[termion-1.5.6.sha256sum] = "077185e2eac69c3f8379a4298e1e07cd36beb962290d4a51199acf0fdc10607e"
SRC_URI[termios-0.2.2.sha256sum] = "d5d9cf598a6d7ce700a4e6a9199da127e6819a61e64b68609683cc9a01b5683a"
SRC_URI[textwrap-0.11.0.sha256sum] = "d326610f408c7a4eb6f51c37c330e496b08506c9457c9d34287ecc38809fb060"
SRC_URI[thiserror-1.0.22.sha256sum] = "0e9ae34b84616eedaaf1e9dd6026dbe00dcafa92aa0c8077cb69df1fcfe5e53e"
SRC_URI[thiserror-1.0.30.sha256sum] = "854babe52e4df1653706b98fcfc05843010039b406875930a70e4d9644e5c417"
SRC_URI[thiserror-impl-1.0.22.sha256sum] = "9ba20f23e85b10754cd195504aebf6a27e2e6cbe28c17778a0c930724628dd56"
SRC_URI[thiserror-impl-1.0.30.sha256sum] = "aa32fd3f627f367fe16f893e2597ae3c05020f8bba2666a4e6ea73d377e5714b"
SRC_URI[thread_local-1.0.1.sha256sum] = "d40c6d1b69745a6ec6fb1ca717914848da4b44ae29d9b3080cbee91d72a69b14"
SRC_URI[thread_local-1.1.3.sha256sum] = "8018d24e04c95ac8790716a5987d0fec4f8b27249ffa0f7d33f1369bdfb88cbd"
SRC_URI[threadpool-1.7.1.sha256sum] = "e2f0c90a5f3459330ac8bc0d2f879c693bb7a2f59689c1083fc4ef83834da865"
SRC_URI[time-0.1.44.sha256sum] = "6db9e6914ab8b1ae1c260a4ae7a49b6c5611b40328a735b21862567685e73255"
SRC_URI[tiny_http-0.6.2.sha256sum] = "1661fa0a44c95d01604bd05c66732a446c657efb62b5164a7a083a3b552b4951"
SRC_URI[tinytemplate-1.2.1.sha256sum] = "be4d6b5f19ff7664e8c98d03e2139cb510db9b0a60b55f8e8709b689d939b6bc"
SRC_URI[tinyvec-1.1.0.sha256sum] = "ccf8dbc19eb42fba10e8feaaec282fb50e2c14b2726d6301dbfeed0f73306a6f"
SRC_URI[tinyvec_macros-0.1.0.sha256sum] = "cda74da7e1a664f795bb1f8a87ec406fb89a02522cf6e50620d016add6dbbf5c"
SRC_URI[tokio-1.14.0.sha256sum] = "70e992e41e0d2fb9f755b37446f20900f64446ef54874f40a60c78f021ac6144"
SRC_URI[tokio-macros-1.6.0.sha256sum] = "c9efc1aba077437943f7515666aa2b882dfabfbfdf89c819ea75a8d6e9eaba5e"
SRC_URI[toml-0.5.0.sha256sum] = "87c5890a989fa47ecdc7bcb4c63a77a82c18f306714104b1decfd722db17b39e"
SRC_URI[tracing-0.1.29.sha256sum] = "375a639232caf30edfc78e8d89b2d4c375515393e7af7e16f01cd96917fb2105"
SRC_URI[tracing-attributes-0.1.18.sha256sum] = "f4f480b8f81512e825f337ad51e94c1eb5d3bbdf2b363dcd01e2b19a9ffe3f8e"
SRC_URI[tracing-core-0.1.21.sha256sum] = "1f4ed65637b8390770814083d20756f87bfa2c21bf2f110babdc5438351746e4"
SRC_URI[tracing-log-0.1.2.sha256sum] = "a6923477a48e41c1951f1999ef8bb5a3023eb723ceadafe78ffb65dc366761e3"
SRC_URI[tracing-subscriber-0.3.1.sha256sum] = "80a4ddde70311d8da398062ecf6fc2c309337de6b0f77d6c27aff8d53f6fca52"
SRC_URI[twoway-0.1.8.sha256sum] = "59b11b2b5241ba34be09c3cc85a36e56e48f9888862e19cedf23336d35316ed1"
SRC_URI[typenum-1.12.0.sha256sum] = "373c8a200f9e67a0c95e62a4f52fbf80c23b4381c05a17845531982fa99e6b33"
SRC_URI[typenum-1.14.0.sha256sum] = "b63708a265f51345575b27fe43f9500ad611579e764c79edbc2037b1121959ec"
SRC_URI[unicase-1.4.2.sha256sum] = "7f4765f83163b74f957c797ad9253caf97f103fb064d3999aea9568d09fc8a33"
SRC_URI[unicode-bidi-0.3.4.sha256sum] = "49f2bd0c6468a8230e1db229cff8029217cf623c767ea5d60bfbd42729ea54d5"
SRC_URI[unicode-normalization-0.1.16.sha256sum] = "a13e63ab62dbe32aeee58d1c5408d35c36c392bba5d9d3142287219721afe606"
SRC_URI[unicode-segmentation-1.7.1.sha256sum] = "bb0d2e7be6ae3a5fa87eed5fb451aff96f2573d2694942e40543ae0bbe19c796"
SRC_URI[unicode-segmentation-1.8.0.sha256sum] = "8895849a949e7845e06bd6dc1aa51731a103c42707010a5b591c0038fb73385b"
SRC_URI[unicode-width-0.1.5.sha256sum] = "882386231c45df4700b275c7ff55b6f3698780a650026380e72dabe76fa46526"
SRC_URI[unicode-width-0.1.9.sha256sum] = "3ed742d4ea2bd1176e236172c8429aaf54486e7ac098db29ffe6529e0ce50973"
SRC_URI[unicode-xid-0.0.4.sha256sum] = "8c1f860d7d29cf02cb2f3f359fd35991af3d30bac52c57d265a3c461074cb4dc"
SRC_URI[unicode-xid-0.1.0.sha256sum] = "fc72304796d0818e357ead4e000d19c9c174ab23dc11093ac919054d20a6a7fc"
SRC_URI[unicode-xid-0.2.1.sha256sum] = "f7fe0bb3479651439c9112f72b6c505038574c9fbb575ed1bf3b797fa39dd564"
SRC_URI[unicode-xid-0.2.2.sha256sum] = "8ccb82d61f80a663efe1f787a51b16b5a51e3314d6ac365b08639f52387b33f3"
SRC_URI[url-1.7.2.sha256sum] = "dd4e7c0d531266369519a4aa4f399d748bd37043b00bde1e4ff1f60a120b355a"
SRC_URI[userfaultfd-0.4.2.sha256sum] = "3b738009e099b4ded1ecf19dfb7631f69c24f16e0af6d29fd9b3f54a092aca46"
SRC_URI[userfaultfd-sys-0.4.0.sha256sum] = "1f03138f85fb1a85b1324bd34f29491c6592fff9bcc8fb7d4176d2166185d2de"
SRC_URI[uuid-0.7.4.sha256sum] = "90dbc611eb48397705a6b0f6e917da23ae517e4d127123d2cf7674206627d32a"
SRC_URI[uuid-0.8.2.sha256sum] = "bc5cf98d8186244414c848017f0e2676b3fcb46807f6668a97dfe67359a3c4b7"
SRC_URI[vec_map-0.8.1.sha256sum] = "05c78687fb1a80548ae3250346c3db86a80a7cdd77bda190189f2d0a0987c81a"
SRC_URI[vec_map-0.8.2.sha256sum] = "f1bddf1187be692e79c5ffeab891132dfb0f236ed36a43c7ed39f1165ee20191"
SRC_URI[veriwasm-0.1.4.sha256sum] = "8eec3db7d41973c73f9d7ca57ea0858af7038f87f28280cd9507aaadbd917172"
SRC_URI[version_check-0.1.5.sha256sum] = "914b1a6776c4c929a602fafd8bc742e06365d4bcbe48c30f9cca5824f70dc9dd"
SRC_URI[version_check-0.9.2.sha256sum] = "b5a972e5669d67ba988ce3dc826706fb0a8b01471c088cb0b6110b805cc36aed"
SRC_URI[version_check-0.9.3.sha256sum] = "5fecdca9a5291cc2b8dcf7dc02453fee791a280f3743cb0905f8822ae463b3fe"
SRC_URI[void-1.0.2.sha256sum] = "6a02e4885ed3bc0f2de90ea6dd45ebcbb66dacffe03547fadbb0eeae2770887d"
SRC_URI[wabt-0.10.0.sha256sum] = "00bef93d5e6c81a293bccf107cf43aa47239382f455ba14869d36695d8963b9c"
SRC_URI[wabt-sys-0.8.0.sha256sum] = "1a4e043159f63e16986e713e9b5e1c06043df4848565bf672e27c523864c7791"
SRC_URI[wait-timeout-0.2.0.sha256sum] = "9f200f5b12eb75f8c1ed65abd4b2db8a6e1b138a20de009dacee265a2498f3f6"
SRC_URI[walkdir-2.3.2.sha256sum] = "808cf2735cd4b6866113f648b791c6adc5714537bc222d9347bb203386ffda56"
SRC_URI[wasi-0.10.0+wasi-snapshot-preview1.sha256sum] = "1a143597ca7c7793eff794def352d41792a93c481eb1042423ff7ff72ba2c31f"
SRC_URI[wasi-0.10.2+wasi-snapshot-preview1.sha256sum] = "fd6fbd9a79829dd1ad0cc20627bf1ed606756a7f77edff7b66b7064f9cb327c6"
SRC_URI[wasi-0.9.0+wasi-snapshot-preview1.sha256sum] = "cccddf32554fecc6acb585f82a32a72e28b48f8c4c1883ddfeeeaa96f7d8e519"
SRC_URI[wasi-cap-std-sync-0.32.0.sha256sum] = "f23cb8c01ff3b733418d594df1fab090a4ece29a1260c5364df67e8fe7e08634"
SRC_URI[wasi-common-0.32.0.sha256sum] = "6c1e8cb75656702a5b843ef609c4e49b7a257f3bfcbf95ce9f32e4d1c9cf933b"
SRC_URI[wasi-tokio-0.32.0.sha256sum] = "871451d80bd1a9584b9ac5eaec3dc77ff67417fbfadba0eeb6f1abfeba03ae9b"
SRC_URI[wasm-bindgen-0.2.78.sha256sum] = "632f73e236b219150ea279196e54e610f5dbafa5d61786303d4da54f84e47fce"
SRC_URI[wasm-bindgen-backend-0.2.78.sha256sum] = "a317bf8f9fba2476b4b2c85ef4c4af8ff39c3c7f0cdfeed4f82c34a880aa837b"
SRC_URI[wasm-bindgen-macro-0.2.78.sha256sum] = "d56146e7c495528bf6587663bea13a8eb588d39b36b679d83972e1a2dbbdacf9"
SRC_URI[wasm-bindgen-macro-support-0.2.78.sha256sum] = "7803e0eea25835f8abdc585cd3021b3deb11543c6fe226dcd30b228857c5c5ab"
SRC_URI[wasm-bindgen-shared-0.2.78.sha256sum] = "0237232789cf037d5480773fe568aac745bfe2afbc11a863e97901780a6b47cc"
SRC_URI[wasm-encoder-0.4.1.sha256sum] = "51b4949d4f2b25a4b208317dcf86aacef9e7a5884e48dfc45d4aeb91808d6f86"
SRC_URI[wasm-smith-0.3.2.sha256sum] = "5af0d70f17515b1bc412b7727b01304ba2484bc416da72f325d6bf4ab58f4213"
SRC_URI[wasmparser-0.57.0.sha256sum] = "32fddd575d477c6e9702484139cf9f23dcd554b06d185ed0f56c857dd3a47aa6"
SRC_URI[wasmparser-0.59.0.sha256sum] = "a950e6a618f62147fd514ff445b2a0b53120d382751960797f85f058c7eda9b9"
SRC_URI[wasmparser-0.67.0.sha256sum] = "9f091cf3849e5fe76a60255bff169277459f2201435bc583b6656880553f0ad0"
SRC_URI[wasmparser-0.69.2.sha256sum] = "fd2dd6dadf3a723971297bcc0ec103e0aa8118bf68e23f49cb575e21621894a8"
SRC_URI[wasmparser-0.81.0.sha256sum] = "98930446519f63d00a836efdc22f67766ceae8dbcc1571379f2bcabc6b2b9abc"
SRC_URI[wasmprinter-0.2.16.sha256sum] = "dba006f5c5bf41a2a5c3b45e861ea6eb067382acb022b6a35a00a0390f9547f6"
SRC_URI[wasmtime-0.32.0.sha256sum] = "5d59b4bcc681f894d018e7032ba3149ab8e5f86828fab0b6ff31999c5691f20b"
SRC_URI[wasmtime-environ-0.32.0.sha256sum] = "c39e4ba1fb154cca6a0f2350acc83248e22defb0cc647ae78879fe246a49dd61"
SRC_URI[wasmtime-jit-0.32.0.sha256sum] = "3dd538de9501eb0f2c4c7b3d8acc7f918276ca28591a67d4ebe0672ebd558b65"
SRC_URI[wasmtime-runtime-0.32.0.sha256sum] = "910ccbd8cc18a02f626a1b2c7a7ddb57808db3c1780fd0af0aa5a5dae86c610b"
SRC_URI[wasmtime-types-0.32.0.sha256sum] = "115bfe5c6eb6aba7e4eaa931ce225871c40280fb2cfb4ce4d3ab98d082e52fc4"
SRC_URI[wast-28.0.0.sha256sum] = "9c0586061bfacc035034672c8d760802b428ab4c80a92e2a392425c516df9be1"
SRC_URI[wast-35.0.2.sha256sum] = "2ef140f1b49946586078353a453a1d28ba90adfc54dde75710bc1931de204d68"
SRC_URI[wat-1.0.29.sha256sum] = "c06d55b5ec4f9d9396fa99abaafa0688597395e57827dffd89731412ae90c9bf"
SRC_URI[web-sys-0.3.55.sha256sum] = "38eb105f1c59d9eaa6b5cdc92b859d85b926e82cb2e0945cd0c9259faa6fe9fb"
SRC_URI[wiggle-0.32.0.sha256sum] = "c2b956030cc391da52988f56bfbd43fed8c3d761fe20cf511e3eddb6cbc15c8c"
SRC_URI[wiggle-generate-0.32.0.sha256sum] = "10f3fd4dc7e543742f782816877768b6b5b2bd6e8998a9c377d898dbff964dcb"
SRC_URI[wiggle-macro-0.32.0.sha256sum] = "4444dd08ea99536640db03740c04245e9e2763607a4ab58440eb852789e86283"
SRC_URI[winapi-0.2.8.sha256sum] = "167dc9d6949a9b857f3451275e911c3f44255842c1f7a76f33c55103a909087a"
SRC_URI[winapi-0.3.7.sha256sum] = "f10e386af2b13e47c89e7236a7a14a086791a2b88ebad6df9bf42040195cf770"
SRC_URI[winapi-0.3.9.sha256sum] = "5c839a674fcd7a98952e593242ea400abe93992746761e38641405d28b00f419"
SRC_URI[winapi-build-0.1.1.sha256sum] = "2d315eee3b34aca4797b2da6b13ed88266e6d612562a0c46390af8299fc699bc"
SRC_URI[winapi-i686-pc-windows-gnu-0.4.0.sha256sum] = "ac3b87c63620426dd9b991e5ce0329eff545bccbbb34f3be09ff6fb6ab51b7b6"
SRC_URI[winapi-util-0.1.5.sha256sum] = "70ec6ce85bb158151cae5e5c87f95a8e97d2c0c4b001223f33a334e3ce5de178"
SRC_URI[winapi-x86_64-pc-windows-gnu-0.4.0.sha256sum] = "712e227841d057c1ee1cd2fb22fa7e5a5461ae8e48fa2ca79ec42cfc1931183f"
SRC_URI[winx-0.29.2.sha256sum] = "afba0891d41a50943c32fcea61e124b9dd5755275054b0a3e1e1eba26e671137"
SRC_URI[witx-0.9.1.sha256sum] = "e366f27a5cabcddb2706a78296a40b8fcc451e1a6aba2fc1d94b4a01bdaaef4b"
SRC_URI[wyz-0.2.0.sha256sum] = "85e60b0d1b5f99db2556934e21937020776a5d31520bf169e851ac44e6420214"
SRC_URI[yaxpeax-arch-0.2.7.sha256sum] = "f1ba5c2f163fa2f866c36750c6c931566c6d93231ae9410083b0738953b609d5"
SRC_URI[yaxpeax-arm-0.1.3.sha256sum] = "b54eb6b1d08e5e3ccf66b7565aa5dbc2f917bfe4a30c90c995065a2643bbe3b1"
SRC_URI[yaxpeax-core-0.0.4-vw-tweaks.sha256sum] = "932d7fc91521fdaae17dd6f33f0de9d39033c453c4f0a84761613ae19dec72fc"
SRC_URI[yaxpeax-msp430-0.1.1.sha256sum] = "5de2211ec03a726b4b2a3a3f63789e8fe8e41b1e7be2e7034df44e4148f6e8be"
SRC_URI[yaxpeax-pic17-0.1.1.sha256sum] = "15ca63b323712143e563e146af6a3df21fa3c75976985ee7b157470616c15c1e"
SRC_URI[yaxpeax-pic18-0.1.1.sha256sum] = "f64bb0d36fc65721e5919e9febe316ae62cf0ba2510cddb01d1f182ddcc97f84"
SRC_URI[yaxpeax-x86-1.1.1.sha256sum] = "112bc187570a8d998084e0594071a07db0d04977a073ae04ce488fe46ad45951"

SRCREV = "d0b358c5b4177f6d7382ef4e88e688bca19b4b8d"

inherit cargo
inherit sca
inherit cargo-update-recipe-crates

SCA_ENABLED_MODULES = "cargodeny clippy"

# Compilation of this outdated code
# is broken
# but as we are only interested in
# the lints, disabling all the tasks
# is the way forward
do_compile() {
    :
}

do_install() {
    :
}

ALLOW_EMPTY:${PN} = "1"
