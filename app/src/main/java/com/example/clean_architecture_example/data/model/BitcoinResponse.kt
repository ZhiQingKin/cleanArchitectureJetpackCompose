package com.example.clean_architecture_example.data.model

data class BitcoinResponse(
    val data: Data
)

data class Data(
    val currency: String,
    val rates: Rates
)

data class Rates(
    val AAVE: String?,
    val ABT: String?,
    val ACH: String?,
    val ACS: String?,
    val ADA: String?,
    val AED: String?,
    val AERGO: String?,
    val AERO: String?,
    val AEVO: String?,
    val AFN: String?,
    val AGLD: String?,
    val AIOZ: String?,
    val AKT: String?,
    val ALCX: String?,
    val ALEPH: String?,
    val ALGO: String?,
    val ALICE: String?,
    val ALL: String?,
    val AMD: String?,
    val AMP: String?,
    val ANG: String?,
    val ANKR: String?,
    val ANT: String?,
    val AOA: String?,
    val APE: String?,
    val API3: String?,
    val APT: String?,
    val AR: String?,
    val ARB: String?,
    val ARKM: String?,
    val ARPA: String?,
    val ARS: String?,
    val ASM: String?,
    val AST: String?,
    val ATA: String?,
    val ATOM: String?,
    val AUCTION: String?,
    val AUD: String?,
    val AUDIO: String?,
    val AURORA: String?,
    val AVAX: String?,
    val AVT: String?,
    val AWG: String?,
    val AXL: String?,
    val AXS: String?,
    val AZN: String?,
    val BADGER: String?,
    val BAL: String?,
    val BAM: String?,
    val BAND: String?,
    val BAT: String?,
    val BBD: String?,
    val BCH: String?,
    val BDT: String?,
    val BGN: String?,
    val BHD: String?,
    val BICO: String?,
    val BIF: String?,
    val BIGTIME: String?,
    val BIT: String?,
    val BLUR: String?,
    val BLZ: String?,
    val BMD: String?,
    val BND: String?,
    val BNT: String?,
    val BOB: String?,
    val BOBA: String?,
    val BOND: String?,
    val BONK: String?,
    val BRL: String?,
    val BSD: String?,
    val BSV: String?,
    val BTC: String?,
    val BTN: String?,
    val BTRST: String?,
    val BUSD: String?,
    val BWP: String?,
    val BYN: String?,
    val BYR: String?,
    val BZD: String?,
    val C98: String?,
    val CAD: String?,
    val CBETH: String?,
    val CDF: String?,
    val CELR: String?,
    val CGLD: String?,
    val CHF: String?,
    val CHZ: String?,
    val CLF: String?,
    val CLP: String?,
    val CLV: String?,
    val CNH: String?,
    val CNY: String?,
    val COMP: String?,
    val COP: String?,
    val COTI: String?,
    val COVAL: String?,
    val CRC: String?,
    val CRO: String?,
    val CRPT: String?,
    val CRV: String?,
    val CTSI: String?,
    val CTX: String?,
    val CUC: String?,
    val CUP: String?,
    val CVC: String?,
    val CVE: String?,
    val CVX: String?,
    val CZK: String?,
    val DAI: String?,
    val DAR: String?,
    val DASH: String?,
    val DDX: String?,
    val DESO: String?,
    val DEXT: String?,
    val DIA: String?,
    val DIMO: String?,
    val DJF: String?,
    val DKK: String?,
    val DNT: String?,
    val DOGE: String?,
    val DOP: String?,
    val DOT: String?,
    val DREP: String?,
    val DYP: String?,
    val DZD: String?,
    val EGLD: String?,
    val EGP: String?,
    val ELA: String?,
    val ENA: String?,
    val ENJ: String?,
    val ENS: String?,
    val EOS: String?,
    val ERN: String?,
    val ETB: String?,
    val ETC: String?,
    val ETH: String?,
    val ETH2: String?,
    val ETHFI: String?,
    val EUR: String?,
    val EUROC: String?,
    val FARM: String?,
    val FET: String?,
    val FIDA: String?,
    val FIL: String?,
    val FIS: String?,
    val FJD: String?,
    val FKP: String?,
    val FLOW: String?,
    val FLR: String?,
    val FORT: String?,
    val FORTH: String?,
    val FOX: String?,
    val FTM: String?,
    val FX: String?,
    val GAL: String?,
    val GALA: String?,
    val GBP: String?,
    val GEL: String?,
    val GFI: String?,
    val GGP: String?,
    val GHS: String?,
    val GHST: String?,
    val GIP: String?,
    val GLM: String?,
    val GMD: String?,
    val GMT: String?,
    val GNF: String?,
    val GNO: String?,
    val GNT: String?,
    val GODS: String?,
    val GRT: String?,
    val GST: String?,
    val GTC: String?,
    val GTQ: String?,
    val GUSD: String?,
    val GYD: String?,
    val GYEN: String?,
    val HBAR: String?,
    val HFT: String?,
    val HIGH: String?,
    val HKD: String?,
    val HNL: String?,
    val HNT: String?,
    val HONEY: String?,
    val HOPR: String?,
    val HRK: String?,
    val HTG: String?,
    val HUF: String?,
    val ICP: String?,
    val IDEX: String?,
    val IDR: String?,
    val ILS: String?,
    val ILV: String?,
    val IMP: String?,
    val IMX: String?,
    val INDEX: String?,
    val INJ: String?,
    val INR: String?,
    val INV: String?,
    val IOTX: String?,
    val IQD: String?,
    val IRR: String?,
    val ISK: String?,
    val JASMY: String?,
    val JEP: String?,
    val JMD: String?,
    val JOD: String?,
    val JPY: String?,
    val JTO: String?,
    val JUP: String?,
    val KARRAT: String?,
    val KAVA: String?,
    val KEEP: String?,
    val KES: String?,
    val KGS: String?,
    val KHR: String?,
    val KMF: String?,
    val KNC: String?,
    val KRL: String?,
    val KRW: String?,
    val KSM: String?,
    val KWD: String?,
    val KYD: String?,
    val KZT: String?,
    val LAK: String?,
    val LBP: String?,
    val LCX: String?,
    val LDO: String?,
    val LINK: String?,
    val LIT: String?,
    val LKR: String?,
    val LOKA: String?,
    val LOOM: String?,
    val LPT: String?,
    val LQTY: String?,
    val LRC: String?,
    val LRD: String?,
    val LSETH: String?,
    val LSL: String?,
    val LTC: String?,
    val LTL: String?,
    val LVL: String?,
    val LYD: String?,
    val MAD: String?,
    val MAGIC: String?,
    val MANA: String?,
    val MASK: String?,
    val MATH: String?,
    val MATIC: String?,
    val MCO2: String?,
    val MDL: String?,
    val MDT: String?,
    val MEDIA: String?,
    val METIS: String?,
    val MGA: String?,
    val MINA: String?,
    val MIR: String?,
    val MKD: String?,
    val MKR: String?,
    val MLN: String?,
    val MMK: String?,
    val MNDE: String?,
    val MNT: String?,
    val MOBILE: String?,
    val MONA: String?,
    val MOP: String?,
    val MPL: String?,
    val MRO: String?,
    val MRU: String?,
    val MSOL: String?,
    val MTL: String?,
    val MULTI: String?,
    val MUR: String?,
    val MUSE: String?,
    val MVR: String?,
    val MWK: String?,
    val MXC: String?,
    val MXN: String?,
    val MYR: String?,
    val MZN: String?,
    val NAD: String?,
    val NCT: String?,
    val NEAR: String?,
    val NEON: String?,
    val NEST: String?,
    val NFT: String?,
    val NGN: String?,
    val NMR: String?,
    val NOK: String?,
    val NOTE: String?,
    val NPR: String?,
    val NU: String?,
    val NZD: String?,
    val OCEAN: String?,
    val OG: String?,
    val OKB: String?,
    val OMG: String?,
    val OMNI: String?,
    val OMR: String?,
    val ONT: String?,
    val OP: String?,
    val ORCA: String?,
    val OXT: String?,
    val OXY: String?,
    val PAB: String?,
    val PAN: String?,
    val PARA: String?,
    val PARS: String?,
    val PAX: String?,
    val PEN: String?,
    val PERP: String?,
    val PERX: String?,
    val PERXX: String?,
    val PFP: String?,
    val PHP: String?,
    val PLA: String?,
    val PLN: String?,
    val POLY: String?,
    val POWR: String?,
    val PRQ: String?,
    val PRT: String?,
    val PSY: String?,
    val PUNDIX: String?,
    val PYPL: String?,
    val QAR: String?,
    val QDX: String?,
    val QUICK: String?,
    val QSP: String?,
    val QTUM: String?,
    val RAD: String?,
    val RARE: String?,
    val RARI: String?,
    val RAY: String?,
    val RDD: String?,
    val REN: String?,
    val REP: String?,
    val REQ: String?,
    val RGT: String?,
    val RIF: String?,
    val RLC: String?,
    val RLY: String?,
    val RNDR: String?,
    val ROOK: String?,
    val RPL: String?,
    val RSD: String?,
    val RSS: String?,
    val RSS3: String?,
    val RTFKT: String?,
    val RUB: String?,
    val RUNE: String?,
    val RWF: String?,
    val SAI: String?,
    val SALT: String?,
    val SAND: String?,
    val SAR: String?,
    val SCALE: String?,
    val SCONE: String?,
    val SDG: String?,
    val SDT: String?,
    val SEK: String?,
    val SHIB: String?,
    val SHP: String?,
    val SKL: String?,
    val SLE: String?,
    val SLV: String?,
    val SLY: String?,
    val SMA: String?,
    val SMART: String?,
    val SMT: String?,
    val SNGJ: String?,
    val SNX: String?,
    val SOL: String?,
    val SOP: String?,
    val SOS: String?,
    val SRM: String?,
    val SSP: String?,
    val STANDARD: String?,
    val STETH: String?,
    val STG: String?,
    val STORJ: String?,
    val STRAX: String?,
    val STSOL: String?,
    val STT: String?,
    val STX: String?,
    val SUI: String?,
    val SUSHI: String?,
    val SWP: String?,
    val SXP: String?,
    val SYN: String?,
    val SZL: String?,
    val T: String?,
    val TACO: String?,
    val TAI: String?,
    val TAJ: String?,
    val TBA: String?,
    val TEL: String?,
    val THB: String?,
    val THC: String?,
    val THETA: String?,
    val TJS: String?,
    val TMT: String?,
    val TND: String?,
    val TOP: String?,
    val TRAC: String?,
    val TRB: String?,
    val TRIBE: String?,
    val TRP: String?,
    val TRU: String?,
    val TRY: String?,
    val TTD: String?,
    val TUSD: String?,
    val TVK: String?,
    val TWDT: String?,
    val TWT: String?,
    val TXL: String?,
    val TZC: String?,
    val TZD: String?,
    val TZS: String?,
    val UAH: String?,
    val UMA: String?,
    val UNFI: String?,
    val UNI: String?,
    val UP: String?,
    val UPUSD: String?,
    val USD: String?,
    val USDC: String?,
    val USDT: String?,
    val UST: String?,
    val UYU: String?,
    val UZS: String?,
    val VALUE: String?,
    val VBK: String?,
    val VEF: String?,
    val VES: String?,
    val VET: String?,
    val VGX: String?,
    val VND: String?,
    val VUV: String?,
    val VYN: String?,
    val WAMPL: String?,
    val WBTC: String?,
    val WBNB: String?,
    val WCK: String?,
    val WEMIX: String?,
    val WGRT: String?,
    val WICC: String?,
    val WINGS: String?,
    val WNCG: String?,
    val WNXM: String?,
    val WOOP: String?,
    val WORM: String?,
    val WTR: String?,
    val WUSD: String?,
    val X: String?,
    val XAF: String?,
    val XCD: String?,
    val XCHF: String?,
    val XDC: String?,
    val XDR: String?,
    val XEC: String?,
    val XEM: String?,
    val XER: String?,
    val XETH: String?,
    val XGO: String?,
    val XLM: String?,
    val XMR: String?,
    val XOF: String?,
    val XRP: String?,
    val XTZ: String?,
    val XVG: String?,
    val XVS: String?,
    val XYO: String?,
    val XZC: String?,
    val YFI: String?,
    val YFII: String?,
    val YGG: String?,
    val YUBI: String?,
    val ZAR: String?,
    val ZBC: String?,
    val ZEC: String?,
    val ZEN: String?,
    val ZIL: String?,
    val ZKS: String?,
    val ZRX: String?,
    val ZWL: String?
)